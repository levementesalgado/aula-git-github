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

## Como rodar

```ksh
# compilar tudo
javac -d out $(find . -name '*.java')

# rodar um exemplo
java -cp out NomeIdade
```

`out/` e os `*.class` já estão no `.gitignore` — bytecode não entra no git.

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