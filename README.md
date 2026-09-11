# aula-git-github

Repositório de aprendizado de **Git e GitHub** — primeiros passos com versionamento,
commits, branches e push remoto.

##  O que tem aqui

| Arquivo | Descrição |
|---------|-----------|
| `OlaGithub.java` | Hello World em Java — o arquivo principal |
| `Hipercubo8D.java` | Convidado especial (caiu aqui sem querer, mas é legal — ver abaixo) |

##  Como rodar

Requer JDK 17+ (usa `record`, `var`, `Optional`).

```ksh
# compilar
javac OlaGithub.java

# executar
java OlaGithub
```

Saída esperada:

```
Olá, GitHub
```

##  O que eu aprendi nessa aula

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

Isso quase sempre é porque algum `sudo git` rodou antes e o `.git/` ficou com dono `root`. Fix:

```ksh
sudo chown -R "$USER:$USER" .git
```

**Nunca rode `sudo git`**. Git não precisa de root pra nada em repositório de usuário.

##  Convidado especial: `Hipercubo8D.java`

Caiu aqui sem querer, mas não sei onde enfiar então vou aproveitar pra não apagar esse repo em um ano — é uma estrutura de dados
de **256 vértices** (2⁸) onde cada vértice guarda uma matriz `NxM` + um nome,
com 5 modos de busca:

1. **Por nome** — lookup direto via `HashMap`
2. **Por endereço exato** — 8 bits → índice
3. **Por Hamming** — vizinhos mais próximos no grafo do hipercubo
4. **Por Frobenius** — distância entre matrizes
5. **Por padrão com wildcard** — busca por combinação parcial (`-1` = "não importa")

Também tem `vizinhos(idx)` (8 vizinhos diretos), `caminho(a, b)` (menor caminho no grafo)
e `histogramaDimensao(d)`.

Pra rodar:

```ksh
javac Hipercubo8D.java
java Hipercubo8D
```

Ele era um treininho de matriz que eu tava fazendo, talvez troque o nome do repo pra algo mais condizente depois (tipo um `estruturas-de-dados` ou `amadeus-lab`)

##  Licença

GPLv3 — ver cabeçalho dos arquivos `.java`.
```
