# Exercícios pendentes

Levantamento do que **ainda não tem código** no repositório, extraído das
listas de exercício e do simulado da AV1 que estão no Classroom.

Data de referência: 03/10/2026.

## O que já está feito

| Tema | Onde |
|---|---|
| Conceitos iniciais, hello world | `exemplos/ola-mundo/` |
| Entrada e saída (`Scanner`) | `exemplos/entrada-saida/` |
| Matrizes 3x3, 5x5, 8x8, aleatória | `matrizes/` |
| POO: classe, getters/setters, interface | `poo/` |
| Estrutura de repetição: `while`, `do while` | `repeticao/` |
| Vetores: `int[]`, `String[]` | `vetores/` |
| Git e GitHub | `README.md` |

## O que falta

### 1. Teste de mesa (Aula 04) — **não tem nada**

O simulado da AV1 cobra isso em 3 dos 4 desafios ("Teste de mesa" aparece
explicitamente). Não é código: é a tabela manual de entrada → linha executada
→ saída. Precisa montar pelo menos um modelo no repo pra servir de padrão.

### 2. Estrutura de decisão (Aulas 06 a 10) — o buraco maior

A lista "FPOO Estrutura de decisão" tem **10 exercícios** e o repo só tem
`SomaVetor.java` usando um `if` solto. Falta:

| # | Enunciado (resumido) | Construtor |
|---|---|---|
| 01 | login e senha, "Bem-vindo ao Sistema Senai" | `if`/`else` |
| 02 | mês informado → nome do mês, ou "Mês Inválido" | `switch` |
| 03 | inteiro negativo → mensagem de erro | `if` simples |
| 04 | 3 reais, mostra soma só se passar de 80 | `if`/`else` |
| 05 | turno M/V/N → Bom Dia / Boa Tarde / Boa Noite | `if`/`else` |
| 06 | 3 números → maior deles | `if`/`else` |
| 07 | letra F/M → Feminino / Masculino | `if`/`else` |
| 08 | 5 notas, média 6 → Aprovado / Reprovado | `if`/`else` |
| 09 | 3 lados → Equilátero / Isósceles / Escaleno | `if`/`else` |
| 10 | calculadora com operador `+ * - /` | `switch` |

**Faltam também** ternário e `switch case`, que têm aula própria (Aula 11) e
não aparecem na lista mas caem na AV1.

### 3. Desafios do simulado da AV1

- **Desafio 1** — converter algoritmo (Portugol) para Java, com teste de mesa
- **Desafio 2** — calcular a área de um objeto
- **Desafio 3** — dia da semana, `switch case` (1 = domingo … 7 = sábado)
- **Desafio 4** — ler 15 números e somar

### 4. Vetores — parcial

Tem leitura e soma. Faltam os clássicos que o professor sempre pede: maior e
menor valor, ordenar, inverter, busca, matriz como tabuleiro.

### 5. Tópicos nem tocados

- **Portugol Studio** (Aula 05) — o curso começa aqui, antes de Java
- **Classe abstrata e interface** (Aula 17) — `poo/` tem interface, mas nada
  abstrato, nada de `abstract`, nada de herança

## Como atacar

Sugestão de ordem, do que mais cai na prova pro menos:

1. `switch case` e ternário (Aula 11) — é o Desafio 3 da AV1 inteira
2. Os 10 de estrutura de decisão, começando pelo 10 (calculadora), que é o que
   mais força o uso de `switch`
3. Os 4 desafios da AV1, que recycle tudo acima
4. Teste de mesa — pelo menos um exemplo modelado por extenso
5. Herança e classe abstrata, quando chegar

## Detalhe que o professor cobra sempre

O "Teste de mesa" aparece citado em quase todo enunciado. É a tabela de
simulação passo a passo, e ele espera ver a coluna de saída. Não é código, é
prova de que você simulou mentalmente antes de escrever.

## Prazo

| Atividade | Entrega |
|---|---|
| Estrutura de decisão (Aulas 06/07) | 10/04 |
| Atividades aula 06 | 10/04 |
| Simulação prática avaliativa (AV1) | 22/05 |
| Relatório de testes do ACC | 16/05 |
| Introdução POO | 25/09 |
| Git e GitHub | 18/09 |

Duas dessas já passaram. Verifica no Classroom se a professor abriu alguma
entrega nova antes de usar essa lista como referência.