# Exercícios pendentes

Levantamento do que **ainda não tem código** no repositório, extraído das
listas de exercício, dos slides das aulas e do simulado da AV1 que estão no
Classroom.

**Base:** `~/logica-programacao/notas/` (texto extraído dos PDFs) e
`~/logica-programacao/pdfs/` (originais).
**Data de referência:** 03/10/2026.

## Como funciona a entrega

É **código**. Pode ir pelo GitHub mesmo — não existe regra de PDF, nem
obrigatoriedade de teste de mesa. O que o professor pede em slide é "entregar
os códigos", e o resto é com você.

Higiene de dados do repo: **cada commit é datado na data da aula** em que o
exercício foi aplicado (`git commit --date`), usando a data de criação do PDF
da aula (sempre quinta, na hora da aula). Assim o histórico no GitHub fica na
mesma ordem que as aulas.

## O que já está feito

| Tema | Onde | Aula |
|---|---|---|
| Conceitos iniciais, hello world | `exemplos/ola-mundo/` | 01–03 |
| Entrada e saída (`Scanner`), 4 operações | `exemplos/entrada-saida/` | 02–03, 08 |
| Estrutura de decisão — lista FPOO (10) | `decisao/` | 06–10 |
| `switch case` e operador ternário | `decisao/MesSwitch.java`, `decisao/BonusSalarial.java` | 11 |
| Repetição: `for`, `while`, `do while` | `repeticao/` | 11–12 |
| Pares e ímpares com os 3 laços | `repeticao/ParesImpares*.java` | 11–12 |
| Vetores: 5 nomes, soma > 15, junção A+B | `vetores/` | 13 |
| Matrizes 3x3, 5x5, 8x8, aleatória | `matrizes/` | *(extra)* |
| POO: classe, getters/setters, interface | `poo/` | 16–17 (parcial) |
| Simulado AV1 — os 4 desafios | `av1/` | AV1 |
| Git e GitHub | `README.md` | 15 |

## O que falta

### 1. POO — o que sobrou das Aulas 16 e 17

| Onde | Pendência |
|---|---|
| Aula 16 (p. 27) | `Pessoa`: adicionar **CPF e RG** (com getter/setter) — o repo tem só 4 atributos |
| Aula 16 (p. 28–39) | Classes `Carro`, `Avião`, `Animal` + as classes dos diagramas das imagens |
| Aula 17 (p. 32–35) | 3 exercícios de **interface** a partir de diagrama (o repo tem `Animal`/`Lobo`, mas `Lobo` está vazio e não implementa a interface) |
| Aula 17 (p. 49) | Transformar `Animal` em **classe abstrata** e fazer getters/setters |
| Aula 17 (p. 61) | 2 exercícios de **`enum`**: 7 marcas de roupa e 10 marcas de carro |

`poo/` tem interface, mas nada de `abstract`, nada de herança, nada de `enum`.

### 2. Atividades Aulas 04/05 — fluxograma e Portugol

Aula 04 traz a lista em fluxograma; a Aula 05 repete a mesma lista pedindo
**FLUXOGRAMA e PORTUGOL**. Não é Java, por isso não virou código aqui — se o
professor aceitar Portugol no repo, dá pra fazer (Portugol Studio roda offline
ou na versão web).

"Para entregar" — p. 33–34 da Aula 04 / p. 43–44 da Aula 05:

1. Soma de 4 números lidos
2. Dois reais A e B → as 4 operações aritméticas
3. Base e altura → área do triângulo `(base * altura) / 2`
4. Fatorial do valor 5

Algoritmos avulsos (mesmas páginas):

5. Ler inteiro → exibir o dobro
6. Três notas → média aritmética
7. Salário + 15% de aumento
8. Celsius → Fahrenheit
9. Horas → minutos e segundos
10. Carro 12 km/l → litros de uma viagem
11. Conta de pizzaria dividida por 3
12. Trocar os valores de A e B entre si e exibir

Obs.: o Desafio 1 da AV1 é exatamente o exercício 2 (as 4 operações) — já está
em `av1/Desafio1Operacoes.java`, e o exercício 3 em `av1/Desafio2AreaTriangulo.java`.

### 3. Tópicos e entregas que não são código

- **Portugol Studio** (Aula 05) — o curso começa aqui, antes de Java
- **Atividade Hackathon** — 100 pts,
  <https://www.even3.com.br/hackathontvbox-unesp/>
- **Instalação Java e IDE Eclipse** — 100 pts (Notion do professor)
- **Pesquisa de satisfação** — link solto no Classroom
- **Relatório de testes do Sistema de ACC** — prazo 16/05, 100 pts

## Prazos publicados no Classroom

| Atividade | Prazo | Fonte |
|---|---|---|
| Estrutura de decisão (Aula 07) | 2026-04-10 | `notas/aula-07---estrutura-de-decis-o.md` |
| Relatório de testes do ACC | 2026-05-16 | `notas/relat-rio-de-testes-do-sistema-de-acc.md` |
| Simulação prática avaliativa (AV1) | 2026-05-22 | `notas/aula---simula-o-pr-tica---avaliativa.md` |
| Git e GitHub | 2026-09-18 | `notas/aula-15---git-github.md` |
| Introdução a POO | 2026-09-25 | `notas/aula-16---introdu-o-poo.md` |
| Aulas 04, 05, 06, 08–13, 17, Hackathon, ACC, Eclipse | **sem prazo publicado** | notas trazem só "Pontos: 100" |

Todos os prazos acima já passaram (hoje é 03/10/2026). Verifica no Classroom se
a professor reabriu alguma entrega ou postou prazo novo antes de usar essa
lista como referência.

## Datas das aulas (usadas nos commits)

Tiradas do `CreationDate` dos PDFs — todas quintas-feiras, hora da aula:

| Aula | Data |
|---|---|
| 01–03 apresentação | 2026-02-19 |
| 04 teste de mesa | 2026-03-12 (PDF 13/03) |
| 05 Portugol Studio | 2026-03-19 |
| 06 estrutura de decisão | 2026-03-26 (PDF 27/03) |
| 07 estrutura de decisão | 2026-04-09 |
| 08 de algoritmo para Java | 2026-04-16 |
| 09 estrutura de decisão Java | 2026-04-23 |
| 10 lista FPOO | 2026-04-30 |
| 11 ternário e switch case | 2026-05-07 |
| AV1 (simulação avaliativa) | 2026-05-21 |
| 11 estrutura de repetição | 2026-08-13 |
| 12 repetição parte 2 | 2026-08-20 |
| 13 vetores | 2026-08-27 |
| 15 Git e GitHub | 2026-09-10 |
| 16 Introdução a POO | 2026-09-17 |
| 17 Classe abstrata e interface | 2026-10-01 |
