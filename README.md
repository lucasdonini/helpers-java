# helpers-java 
Biblioteca não profissional de utilitários para Java, desenvolvida por Lucas Kluska Donini, aluno da Escola de Negócios Germinare Tech.

## Como baixar o .jar?

## Como baixar e usar o `.jar`

Você pode baixar o arquivo `.jar` mais recente na seção **Releases** deste repositório:

➡️ [Clique aqui para acessar os Releases](https://github.com/lucasdonini/helpers-java/releases)
> Substitua o link acima pelo correto após publicar a primeira release.

---

### ✅ IntelliJ IDEA

1. Baixe o arquivo `helpers-java-x.y.z.jar` na aba **Releases**.
2. No seu projeto:
  - Clique com o botão direito na pasta `src`.
  - Selecione **Open Module Settings** (ou pressione `F4`).
  - Vá até **Libraries** > clique em **+** > **Java**.
  - Selecione o `.jar` baixado.
  - Confirme que ele será usado no **Module classpath**.
3. Clique em **Apply** e depois em **OK**.

---

### ✅ Eclipse

1. Baixe o arquivo `helpers-java-x.y.z.jar` na aba **Releases**.
2. No seu projeto:
  - Clique com o botão direito no projeto > **Build Path** > **Configure Build Path**.
  - Vá até a aba **Libraries** > clique em **Add External JARs**.
  - Selecione o `.jar` baixado.
3. Clique em **Apply and Close**.

---

### ✅ Terminal / Linha de comando

1. Baixe o `.jar` e coloque-o na pasta do projeto ou em uma pasta como `libs/`.
2. Compile com:
   ```bash
   javac -cp .:helpers-java-x.y.z.jar SeuArquivo.java


### 1. Classe `Documents`

Métodos utilitários para validação de documentos, como CPF.

---

#### `verifyCpf(cpf: String): boolean`
- **Descrição:** Verifica se o CPF informado (em formato `String`) é válido conforme os dígitos verificadores.
- **Tipo de retorno:** `boolean`
- **Parâmetros:**
  - `cpf`: `String` — CPF a ser validado (com ou sem pontuação, aceita inclusive caracteres inválidos, que serão ignorados).
- **Validação:** Usa os dois dígitos verificadores do CPF para validar a sequência numérica.

---

#### `verifyCpf(cpf: long): boolean`
- **Descrição:** Converte o número fornecido (`long`) para `String` e valida como CPF.
- **Tipo de retorno:** `boolean`
- **Parâmetros:**
  - `cpf`: `long` — Número inteiro do CPF a ser validado.

---

### 2. Classe `Color`

Constantes e métodos utilitários para formatação de texto com cores, estilos e fundos no terminal, usando códigos ANSI.

---

#### Cores de texto (`String`)
- `RESET` — Restaura o estilo padrão.
- `AZUL`, `VERDE`, `VERMELHO`, `AMARELO`, `MAGENTA`, `CIANO`, `PRETO` — Aplicam cor ao texto.

---

#### Estilos de texto (`String`)
- `NEGRITO` — Texto em negrito.
- `SUBLINHADO` — Texto sublinhado.
- `ITALICO` — Texto em itálico.

---

#### Cores de fundo (`String`)
- `BGRESET` — Restaura o fundo padrão.
- `BGPRETO`, `BGVERMELHO`, `BGVERDE`, `BGAMARELO`, `BGAZUL`, `BGMAGENTA`, `BGCIANO`, `BGBRANCO` — Aplicam cor de fundo ao texto.

---

#### `inBlue(txt: String): String`
- **Descrição:** Retorna o texto em azul.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inGreen(txt: String): String`
- **Descrição:** Retorna o texto em verde.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inRed(txt: String): String`
- **Descrição:** Retorna o texto em vermelho.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inYellow(txt: String): String`
- **Descrição:** Retorna o texto em amarelo.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inMagenta(txt: String): String`
- **Descrição:** Retorna o texto em magenta.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inCyan(txt: String): String`
- **Descrição:** Retorna o texto em ciano.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `inBlack(txt: String): String`
- **Descrição:** Retorna o texto em preto.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser colorido.

---

#### `normal(txt: String): String`
- **Descrição:** Retorna o texto com estilo padrão.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto sem formatação.

---

#### `bold(txt: String): String`
- **Descrição:** Retorna o texto em negrito.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `underlined(txt: String): String`
- **Descrição:** Retorna o texto sublinhado.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `italic(txt: String): String`
- **Descrição:** Retorna o texto em itálico.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inBlueBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo azul.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inGreenBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo verde.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inRedBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo vermelho.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inYellowBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo amarelo.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inMagentaBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo magenta.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inCyanBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo ciano.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inBlackBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo preto.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `inWhiteBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo branco.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `normalBg(txt: String): String`
- **Descrição:** Retorna o texto com fundo padrão.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser formatado.

---

#### `negative(value: String): String`
- **Descrição:** Retorna o texto com alto contraste (preto em fundo branco, negrito).
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `value`: `String` — Texto a ser formatado.

---

#### `negative(value: int): String`
- **Descrição:** Retorna o número formatado como string com alto contraste.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `value`: `int` — Valor inteiro a ser formatado.



---

### 3. Classe `Out`

Métodos utilitários para formatação e exibição de mensagens de saída, com foco em centralização e mensagens de erro.

---

#### `erro(msg: String, hint: String): String`
- **Descrição:** Retorna uma `String` formatada como mensagem de erro, com dica adicional.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `msg`: `String` — Mensagem principal de erro.
  - `hint`: `String` — Dica ou contexto adicional.

---

#### `erro(msg: String): String`
- **Descrição:** Retorna uma `String` formatada como mensagem de erro simples.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `msg`: `String` — Mensagem principal de erro.

---

#### `erro(): String`
- **Descrição:** Retorna uma mensagem padrão de erro para entrada inválida.
- **Tipo de retorno:** `String`
- **Parâmetros:** Nenhum

---

#### `sleep(s: double): void`
- **Descrição:** Pausa a execução por um determinado tempo (em segundos).
- **Tipo de retorno:** `void`
- **Parâmetros:**
  - `s`: `double` — Duração da pausa em segundos.

---

#### `center(txt: String, largura: int, preenchimento: String): String`
- **Descrição:** Centraliza o texto `txt` em uma linha com a largura desejada, preenchida pelo caractere definido.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser centralizado.
  - `largura`: `int` — Largura total da linha.
  - `preenchimento`: `String` — Caractere(s) usado(s) para preencher os espaços.

---

#### `center(txt: String, preenchimento: String): String`
- **Descrição:** Centraliza o texto `txt` em uma linha de largura 50, preenchida pelo caractere definido.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser centralizado.
  - `preenchimento`: `String` — Caractere(s) usado(s) para preencher os espaços.

---

#### `center(txt: String, largura: int): String`
- **Descrição:** Centraliza o texto `txt` em uma linha com a largura desejada, usando o caractere `=` como preenchimento.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser centralizado.
  - `largura`: `int` — Largura total da linha.

---

#### `center(txt: String): String`
- **Descrição:** Centraliza o texto `txt` em uma linha de largura 50, usando o caractere `=` como preenchimento.
- **Tipo de retorno:** `String`
- **Parâmetros:**
  - `txt`: `String` — Texto a ser centralizado.

---

#### `test(): String`
- **Descrição:** Método de teste que retorna uma `String` fixa.
- **Tipo de retorno:** `String`
- **Parâmetros:** Nenhum
  
---

### 4. Classe `Matriz`

Métodos utilitários para operações com matrizes, como soma, média, transposição e multiplicações.

---

#### `axisMean(m: int[][], axis: int): int[]`
- **Descrição:** Calcula a média dos valores inteiros ao longo do eixo especificado.
- **Tipo de retorno:** `int[]`
- **Parâmetros:**
    - `m`: `int[][]` — Matriz de inteiros.
    - `axis`: `int` — Eixo da média (0 para colunas, 1 para linhas).

---

#### `axisMean(m: double[][], axis: int): double[]`
- **Descrição:** Calcula a média dos valores reais ao longo do eixo especificado.
- **Tipo de retorno:** `double[]`
- **Parâmetros:**
    - `m`: `double[][]` — Matriz de números reais.
    - `axis`: `int` — Eixo da média (0 para colunas, 1 para linhas).

---

## Licença:
[MIT License](LICENSE).
