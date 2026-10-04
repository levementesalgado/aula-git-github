# Lógica de Programação e Git/GitHub

Repositório da matéria de **Lógica de Programação / Algoritmos**: os exercícios
em Java e a aula de Git e GitHub.

Requer **JDK 17+** (usa `record`, `var`, `Optional`). Nada aqui precisa de nada
além do `java.util.Scanner`.

## O que tem aqui

### Aula de Git e GitHub

| Arquivo | Descrição |
|---|---|
| `OlaGithub.java` | Hello World em Java — o arquivo principal da aula |
| `Hipercubo8D.java` | Convidado especial (caiu aqui sem querer, mas é legal — ver abaixo) |

### Lógica de Programação

| Arquivo | Descrição |
|---|---|
| `exemplos/ola-mundo/Aula1.java` | Hello World |
| `exemplos/entrada-saida/NomeIdade.java` | Lê nome (String) e idade (int) do teclado |
| `exemplos/entrada-saida/Exempro.java` | Lê dois doubles e mostra a soma |
| `exemplos/entrada-saida/Exempro2.java` | Calculadora: soma, subtração, divisão e multiplicação |
| `rascunho/Teste.java` | Hello World com uma piada no `println` |
| `rascunho/Teste2.java` | Idem, segundo rascunho |

### Estrutura de decisão (Aulas 06 a 11)

Lista FPOO de estrutura de decisão + `switch case` e ternário da Aula 11.

| Arquivo | Exercício |
|---|---|
| `decisao/LoginSenha.java` | 01 — login e senha → "Bem-vindo ao Sistema Senai" |
| `decisao/Mes.java` | 02 — número do mês → nome do mês, ou "Mês Inválido" |
| `decisao/NumeroNegativo.java` | 03 — inteiro negativo → mensagem de erro |
| `decisao/SomaOitenta.java` | 04 — 3 reais, soma só se passar de 80 |
| `decisao/Turno.java` | 05 — turno M/V/N → Bom Dia / Boa Tarde / Boa Noite |
| `decisao/MaiorNumero.java` | 06 — 3 números → maior deles |
| `decisao/LetraSexo.java` | 07 — letra F/M → Feminino / Masculino |
| `decisao/MediaNotas.java` | 08 — 5 notas, média 6 → Aprovado / Reprovado |
| `decisao/Triangulo.java` | 09 — 3 lados → Equilátero / Isósceles / Escaleno |
| `decisao/Calculadora.java` | 10 — calculadora com operador `+ - * /` (`switch`) |
| `decisao/MesSwitch.java` | Exercício 02 convertido para `switch case` |
| `decisao/BonusSalarial.java` | Bônus de salário com `if/else`, `switch` e ternário |

### Estrutura de repetição (Aulas 11 e 12)

| Arquivo | Descrição |
|---|---|
| `repeticao/for1.java` | Soma e média de 5 números com `for` |
| `repeticao/while1.java` | Idem com `while` |
| `repeticao/dowhile1.java` | Idem com `do while` |
| `repeticao/ParesImparesFor.java` | 10 inteiros → soma, pares e ímpares com `for` |
| `repeticao/ParesImparesWhile.java` | Idem com `while` |
| `repeticao/ParesImparesDoWhile.java` | Idem com `do while` |

### Vetores (Aula 13)

| Arquivo | Atividade |
|---|---|
| `vetores/AtividadeVetor.java` | 1 — 5 nomes em um vetor e apresentação |
| `vetores/SomaVetor.java` | 2 — 5 inteiros, soma dos elementos se maior que 15 |
| `vetores/VetorJuncao.java` | 3 — vetores A e B juntados no vetor C |

### Simulado da AV1

| Arquivo | Desafio |
|---|---|
| `av1/Desafio1Operacoes.java` | 1 — converter o fluxograma para Java (4 operações) |
| `av1/Desafio2AreaTriangulo.java` | 2 — área do triângulo `b * h / 2` |
| `av1/Desafio3DiaSemana.java` | 3 — dia da semana com `switch case` (1 = domingo … 7 = sábado) |
| `av1/Desafio4Soma15.java` | 4 — ler 15 números e somar |

### Matrizes

| Arquivo | Descrição |
|---|---|
| `matrizes/ExemploMatriz.java` | Matriz 3x3 preenchida na mão, item a item |
| `matrizes/MatrizCincoCinco.java` | Matriz 5x5 |
| `matrizes/MatrizOitoPreco.java` | Matriz 8x8 de `double` |
| `matrizes/MatrizRandomica.java` | Matriz 3x3 preenchida com `Math.random()` |

### POO — Aula 16 (introdução)

| Arquivo | Descrição |
|---|---|
| `poo/Pessoa.java` | Classe com nome, idade, endereço, profissão, **cpf e rg** + getter/setter |
| `poo/POO_first.java` | `main` vazio, ponto de partida da aula |
| `poo/Carro.java` | 4 atributos e 4 métodos (`ligar`, `acelerar`, `frear`, `parar`) |
| `poo/Aviao.java` | 4 atributos e 4 métodos (`ligar`, `decolar`, `acelerar`, `pousar`) |
| `poo/Animal.java` | 4 atributos e 4 métodos (`comer`, `dormir`, `andar`, `emitirSom`) |
| `poo/Cliente.java` | Diagrama da aula: `id`, `nome`, `telefone`, `cpf`, `rg` |
| `poo/ObjetosAula16.java` | Classe principal: cria os objetos e apresenta via `get()` |

### POO — Aula 17 (interface, classe abstrata, enum)

| Arquivo | Descrição |
|---|---|
| `poo/veiculo/Veiculo.java` | Interface com `ligar`, `desligar`, `manobrar`, `engatar`, `acelerar`, `frear` |
| `poo/veiculo/Ferrari.java` | Subclasse implementando a interface |
| `poo/veiculo/ObjetosVeiculo.java` | Classe principal: 2 objetos |
| `poo/computador/Computador.java` | Interface com 4 métodos |
| `poo/computador/Gamer.java`, `Home.java` | Subclasses implementando a interface |
| `poo/computador/ObjetosComputador.java` | Classe principal: 2 objetos |
| `poo/calculos/Calculos.java` | Interface `somar`, `sub`, `mult`, `div`, `exp` |
| `poo/calculos/Calculando.java` | Subclasse implementando a interface |
| `poo/calculos/ObjetosCalculos.java` | Classe principal: apresenta os resultados |
| `poo/classeabstrata/Animal.java` | **Classe abstrata** com `nome`, `sexo`, `raca` + getters/setters |
| `poo/classeabstrata/Lobo.java`, `Leao.java`, `Tigre.java`, `Cachorro.java`, `Gato.java` | 5 subclasses com `emitirSom()` |
| `poo/classeabstrata/ObjetosAnimal.java` | Classe principal: os 5 objetos |
| `poo/enums/Roupa.java` | Enum com 7 marcas de roupa |
| `poo/enums/PrincipalRoupa.java` | Atribui e mostra todas as marcas |
| `poo/enums/MarcaCarro.java` | Enum com 10 marcas de carro |
| `poo/enums/PrincipalCarro.java` | Atribui e mostra todas as marcas |

### Interfaces antigas (primeira atividade)

| Arquivo | Descrição |
|---|---|
| `poo/aula_01_10/Animal.java` | Interface com `dormir`, `caminhar`, `correr`, `emitirSom` |
| `poo/aula_01_10/Lobo.java` | Classe vazia pra implementar a interface |

## Como rodar

```ksh
# compilar tudo (o pacote aula_01_10 sai em out/aula_01_10/)
javac -d out $(find . -name '*.java')

# rodar um exemplo
java -cp out NomeIdade
java -cp out MatrizRandomica
java -cp out ObjetosAula16
java -cp out classeabstrata.ObjetosAnimal   # classe de pacote
```

`out/` e os `*.class` já estão no `.gitignore` — bytecode não entra no git.

## Dialeto que o professor usa

Os arquivos da aula seguem um estilo mais antigo que o "padrão moderno", e vale
copiar. Exemplos que aparecem nos exercícios:

```java
int [][] matriz = new int[5][5];           // espaço entre o tipo e o colchete
public static void main (String[] args) { // espaço antes do parêntese
public class MatrizCincoCinco {           // chave na mesma linha da declaração
```

Ou seja: sem `var`, tipo explícito sempre, `new int[n][m]` em vez de
`{...}`, `Scanner` em vez de `BufferedReader`, e indentação com **tab**. Os
exercícios da aula usam quase só `println`/`print` com concatenação
(`matriz[i][j] + " "`) em vez de `printf` ou `text blocks`. Quando for reescrever
qualquer coisa para entregar, seguir esse dialeto evita o tipo de comentário que
o professor faz sobre recurso que ele não ensinou.

## Git e GitHub

### Comandos essenciais

```ksh
git init                          # inicia repositório local
git add .                         # marca tudo pra commit
git commit -m "mensagem"          # salva um ponto no histórico
git status                        # mostra o que mudou
git log --oneline                 # histórico resumido
git diff                          # diferenças não commitadas
```

### Inspecionando o repo com ksh

```ksh
# listar arquivos versionados
git ls-files | while read -r f; do
    print -- "  $f"
done

# contar commits
print -- "commits: $(git rev-list --count HEAD)"

# último commit formatado
git log -1 --pretty=format:'%h %an %ar: %s'; print
```

### Subindo pro GitHub

```ksh
# opção 1 — criar e subir de uma vez (precisa do gh CLI autenticado)
gh auth login
gh repo create --source=. --public --push

# opção 2 — manual
git remote add origin git@github.com:usuario/aula-git-github.git
git branch -M main
git push -u origin main
```

### Se der "insufficient permission for adding an object"

Isso quase sempre é porque algum `sudo git` rodou antes e o `.git/` ficou com
dono `root`. Fix:

```ksh
sudo chown -R "$USER:$USER" .git
```

**Nunca rode `sudo git`**. Git não precisa de root pra nada em repositório de
usuário.

## Lógica de Programação

### Entrada de dados

```java
Scanner ler = new Scanner(System.in);

String nome = ler.nextLine();    // até o Enter
int    idade = ler.nextInt();    // só o número
double nota  = ler.nextDouble();
```

Detalhe que pega: **nunca misture `nextInt()` com `nextLine()`**. Depois de
`nextInt()` fica um `\n` pendurado, e o `nextLine()` seguinte lê esse `\n` em
vez do que o usuário digitou. A ordem importa:

```java
idade = ler.nextInt();
ler.nextLine();            // consome o resto da linha
nome = ler.nextLine();     // agora sim, correto
```

### Declarar e usar

```java
double a, b, som, sub, div, mul;
```

Declara várias do mesmo tipo de uma vez. `double` para contas com centavos,
`int` só quando é contagem — e `int` não guarda `7.9`, guarda `7`.

## Convidado especial: `Hipercubo8D.java`

Caiu na aula de Git sem querer, mas agora o repo é da matéria inteira e não
tem mais onde esconder. É uma estrutura de dados de **256 vértices** (2⁸) onde
cada vértice guarda uma matriz `NxM` + um nome, com 5 modos de busca:

1. **Por nome** — lookup direto via `HashMap`
2. **Por endereço exato** — 8 bits → índice
3. **Por Hamming** — vizinhos mais próximos no grafo do hipercubo
4. **Por Frobenius** — distância entre matrizes
5. **Por padrão com wildcard** — busca por combinação parcial (`-1` = "não importa")

Também tem `vizinhos(idx)` (8 vizinhos diretos), `caminho(a, b)` (menor caminho
no grafo) e `histogramaDimensao(d)`.

```ksh
javac -d out Hipercubo8D.java
java -cp out Hipercubo8D
```

Era um treininho de matriz que eu tava fazendo.

## Histórico da reorganização

A parte de Lógica de Programação morava em `~/repo/aulasdelogica`, num
repositório separado com um único commit e tudo na raiz — inclusive
`aula1.java`, que era cópia byte a byte de `Aula1.java`, e `jnjnjn.java`, que
não compilava (`public void main` sem `static` e sem chaves).

Como Lógica e Algoritmos são a mesma matéria, tudo foi para cá. Renomeações
feitas (o `javac` exige que a classe pública esteja num arquivo com o mesmo
nome):

| Antes | Agora |
|---|---|
| `aula1.java` | *(removido — cópia byte a byte de `Aula1.java`)* |
| `Aula1.java` | `exemplos/ola-mundo/Aula1.java` |
| `Exempro.java` | `exemplos/entrada-saida/Exempro.java` |
| `Exempro2.java` | `exemplos/entrada-saida/Exempro2.java` |
| `NomeIdade.java` | `exemplos/entrada-saida/NomeIdade.java` |
| `isso.java` | `rascunho/Teste.java` |
| `jnjnjn.java` | `rascunho/Teste2.java` |

A branch também foi renomeada de `master` para `main`.

## Repositório

O remote é `https://github.com/levementesalgado/aula-git-github.git`.

## Licença

GPLv3 — ver cabeçalho dos arquivos `.java`.