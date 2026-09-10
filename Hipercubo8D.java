/*
 * Hipercubo8D.java
 * 
 * Copyright 2026 GNU GPLv3.0 <Mateus Iuri Rocha>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.util.*;
import java.util.stream.*;

/**
 * Hipercubo 8D — 2^8 = 256 vértices, cada um guarda uma matriz NxM
 * + nome de variável, com busca multidimensional.
 *
 * Inspirado no CUBO 7D do AMADEUS (mas binário, pra ficar didático).
 *
 *   DIMENSÃO     NOME           USO TÍPICO
 *   0            classe         S/V/ADJ/ART
 *   1            genero         M/F
 *   2            numero         S/P
 *   3            tempo          P/IMP
 *   4            pessoa         1/2/3
 *   5            modo           IND/SUB
 *   6            aspecto         PERF/IMPERF
 *   7            voz            ATIVA/PASSIVA
 */
public class Hipercubo8D {

    public static final int DIMENSOES = 8;
    public static final int VERTICES  = 1 << DIMENSOES;   // 256
    public static final String[] NOMES_DIM = {
        "classe","genero","numero","tempo",
        "pessoa","modo","aspecto","voz"
    };

    private final int linhas, colunas;
    private final double[][][] matrizes;      // [256][linhas][colunas]
    private final String[]     rotulos;       // nome por vértice
    private final Map<String,Integer> porNome = new HashMap<>();

    public Hipercubo8D(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0)
            throw new IllegalArgumentException("matriz precisa ser > 0");
        this.linhas  = linhas;
        this.colunas = colunas;
        this.matrizes = new double[VERTICES][linhas][colunas];
        this.rotulos  = new String[VERTICES];
    }

    // ────────────────────────────────────────────────────────────
    //  ENDEREÇAMENTO
    // ────────────────────────────────────────────────────────────

    /** 8 bits → índice linear (0..255). */
    public int endereco(int... bits) {
        if (bits.length != DIMENSOES)
            throw new IllegalArgumentException("esperado " + DIMENSOES + " bits");
        int idx = 0;
        for (int i = 0; i < DIMENSOES; i++) {
            if (bits[i] != 0 && bits[i] != 1)
                throw new IllegalArgumentException("bit " + i + " inválido: " + bits[i]);
            idx |= (bits[i] << i);
        }
        return idx;
    }

    /** índice → 8 bits. */
    public int[] bits(int idx) {
        int[] b = new int[DIMENSOES];
        for (int i = 0; i < DIMENSOES; i++) b[i] = (idx >> i) & 1;
        return b;
    }

    // ────────────────────────────────────────────────────────────
    //  ARMAZENAMENTO
    // ────────────────────────────────────────────────────────────

    public void guardar(int[] bits, String nome, double[][] m) {
        if (m.length != linhas || m[0].length != colunas)
            throw new IllegalArgumentException("matriz incompatível");
        int idx = endereco(bits);
        for (int i = 0; i < linhas; i++)
            System.arraycopy(m[i], 0, matrizes[idx][i], 0, colunas);
        rotulos[idx] = nome;
        porNome.put(nome, idx);
    }

    // ────────────────────────────────────────────────────────────
    //  BUSCA 1 — POR NOME
    // ────────────────────────────────────────────────────────────

    public Optional<double[][]> porNome(String nome) {
        Integer idx = porNome.get(nome);
        return idx == null ? Optional.empty()
                           : Optional.of(matrizes[idx]);
    }

    // ────────────────────────────────────────────────────────────
    //  BUSCA 2 — POR ENDEREÇO EXATO
    // ────────────────────────────────────────────────────────────

    public double[][] porEndereco(int... bits) {
        return matrizes[endereco(bits)];
    }

    // ────────────────────────────────────────────────────────────
    //  BUSCA 3 — POR HAMMING (vizinhos mais próximos)
    // ────────────────────────────────────────────────────────────

    public List<Resultado> porHamming(int[] alvo, int k) {
        List<Resultado> lista = new ArrayList<>();
        for (int i = 0; i < VERTICES; i++) {
            if (rotulos[i] == null) continue;
            int d = hamming(bits(i), alvo);
            lista.add(new Resultado(i, rotulos[i], d, Tipo.HAMMING));
        }
        lista.sort(Comparator.comparingDouble(r -> r.distancia));
        return lista.subList(0, Math.min(k, lista.size()));
    }

    public static int hamming(int[] a, int[] b) {
        int d = 0;
        for (int i = 0; i < a.length; i++) d += (a[i] ^ b[i]);
        return d;
    }

    // ────────────────────────────────────────────────────────────
    //  BUSCA 4 — POR CONTEÚDO (distância de Frobenius)
    // ────────────────────────────────────────────────────────────

    public List<Resultado> porMatriz(double[][] alvo, int k) {
        List<Resultado> lista = new ArrayList<>();
        for (int i = 0; i < VERTICES; i++) {
            if (rotulos[i] == null) continue;
            double d = frobenius(matrizes[i], alvo);
            lista.add(new Resultado(i, rotulos[i], d, Tipo.FROBENIUS));
        }
        lista.sort(Comparator.comparingDouble(r -> r.distancia));
        return lista.subList(0, Math.min(k, lista.size()));
    }

    private static double frobenius(double[][] a, double[][] b) {
        double s = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                double d = a[i][j] - b[i][j];
                s += d * d;
            }
        return Math.sqrt(s);
    }

    // ────────────────────────────────────────────────────────────
    //  BUSCA 5 — POR PADRÃO COM WILDCARD (-1 = "não importa")
    // ────────────────────────────────────────────────────────────

    public List<Resultado> porPadrao(int[] padrao) {
        if (padrao.length != DIMENSOES)
            throw new IllegalArgumentException("padrão precisa ter " + DIMENSOES + " posições");
        List<Resultado> lista = new ArrayList<>();
        for (int i = 0; i < VERTICES; i++) {
            if (rotulos[i] == null) continue;
            int[] b = bits(i);
            boolean casa = true;
            for (int d = 0; d < DIMENSOES; d++)
                if (padrao[d] != -1 && padrao[d] != b[d]) { casa = false; break; }
            if (casa) lista.add(new Resultado(i, rotulos[i], 0, Tipo.PADRAO));
        }
        return lista;
    }

    // ────────────────────────────────────────────────────────────
    //  OPERAÇÕES DE ESTRUTURA
    // ────────────────────────────────────────────────────────────

    /** 8 vizinhos de Hamming-1. */
    public List<Integer> vizinhos(int idx) {
        List<Integer> v = new ArrayList<>(DIMENSOES);
        for (int i = 0; i < DIMENSOES; i++) v.add(idx ^ (1 << i));
        return v;
    }

    /** Menor caminho no grafo do hipercubo (só flips Hamming-1). */
    public List<Integer> caminho(int origem, int destino) {
        List<Integer> p = new ArrayList<>();
        int atual = origem; p.add(atual);
        int diff = origem ^ destino;
        for (int i = 0; i < DIMENSOES; i++)
            if (((diff >> i) & 1) == 1) { atual ^= (1 << i); p.add(atual); }
        return p;
    }

    /** Quantos vértices ocupados em cada "linha" de uma dimensão. */
    public int[] histogramaDimensao(int d) {
        int[] h = new int[2];
        for (int i = 0; i < VERTICES; i++)
            if (rotulos[i] != null) h[(i >> d) & 1]++;
        return h;
    }

    // ────────────────────────────────────────────────────────────
    //  UTILIDADES
    // ────────────────────────────────────────────────────────────

    public void imprimir() {
        long ocupados = Arrays.stream(rotulos).filter(Objects::nonNull).count();
        System.out.printf("Hipercubo %dD — %d vértices, %d ocupados, matriz %dx%d%n",
                DIMENSOES, VERTICES, ocupados, linhas, colunas);
        for (int d = 0; d < DIMENSOES; d++) {
            int[] h = histogramaDimensao(d);
            System.out.printf("  dim %d (%s): 0→%d, 1→%d%n",
                d, NOMES_DIM[d], h[0], h[1]);
        }
    }

    public enum Tipo { HAMMING, FROBENIUS, PADRAO }

    public record Resultado(int indice, String nome, double distancia, Tipo tipo) {
        @Override public String toString() {
            return String.format("%-24s d=%.4f  %s  (idx=%d)",
                    nome, distancia, tipo, indice);
        }
    }

    // ────────────────────────────────────────────────────────────
    //  DEMO
    // ────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        var cubo = new Hipercubo8D(3, 3);

        // bits: classe, genero, numero, tempo, pessoa, modo, aspecto, voz
        cubo.guardar(new int[]{0,0,0,0,0,0,0,0}, "verbo_pres_1s",
            new double[][]{{1,2,3},{4,5,6},{7,8,9}});
        cubo.guardar(new int[]{1,0,1,0,1,0,1,0}, "adj_fem_pl",
            new double[][]{{9,8,7},{6,5,4},{3,2,1}});
        cubo.guardar(new int[]{0,1,0,1,0,1,0,1}, "art_masc_pret",
            new double[][]{{2,2,2},{3,3,3},{4,4,4}});
        cubo.guardar(new int[]{1,1,1,1,1,1,1,1}, "subst_pl_perf",
            new double[][]{{5,5,5},{5,5,5},{5,5,5}});
        cubo.guardar(new int[]{0,0,0,1,1,0,0,0}, "verbo_pret_3s",
            new double[][]{{1,0,1},{0,1,0},{1,0,1}});

        cubo.imprimir();

        // ── 1. Por nome ─────────────────────────────────────────
        System.out.println("\n— [1] busca por nome: verbo_pres_1s —");
        cubo.porNome("verbo_pres_1s").ifPresent(m -> {
            for (double[] linha : m)
                System.out.println("  " + Arrays.toString(linha));
        });

        // ── 2. Por endereço ─────────────────────────────────────
        System.out.println("\n— [2] busca por endereço [1,1,1,1,1,1,1,1] —");
        double[][] m = cubo.porEndereco(1,1,1,1,1,1,1,1);
        for (double[] linha : m) System.out.println("  " + Arrays.toString(linha));

        // ── 3. Por Hamming ──────────────────────────────────────
        System.out.println("\n— [3] busca por Hamming (alvo = art_masc_pret) —");
        int[] alvo = {0,1,0,1,0,1,0,0};
        for (var r : cubo.porHamming(alvo, 3)) System.out.println("  " + r);

        // ── 4. Por matriz ───────────────────────────────────────
        System.out.println("\n— [4] busca por matriz (mais próxima de zeros) —");
        double[][] query = {{0,0,0},{0,0,0},{0,0,0}};
        for (var r : cubo.porMatriz(query, 3)) System.out.println("  " + r);

        // ── 5. Por padrão (wildcard) ────────────────────────────
        System.out.println("\n— [5] por padrão [0, *, *, *, *, *, *, *] (classe=0) —");
        int[] padrao = {0,-1,-1,-1,-1,-1,-1,-1};
        for (var r : cubo.porPadrao(padrao)) System.out.println("  " + r);

        // ── Estrutura: vizinhos e caminho ───────────────────────
        int a = cubo.endereco(0,0,0,0,0,0,0,0);
        int b = cubo.endereco(1,1,1,1,1,1,1,1);
        System.out.println("\n— vizinhos diretos do vértice 0 —");
        for (int v : cubo.vizinhos(a))
            System.out.println("  idx=" + v + "  bits=" + Arrays.toString(cubo.bits(v)));

        System.out.println("\n— caminho mínimo de 0…0 a 1…1 —");
        System.out.println("  " + cubo.caminho(a, b));
    }
}

