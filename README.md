# helpers-java
## Passo a Passo de Configuração e Criação do JAR:
1. Clonar e fazer as configurações padrão de todo projeto
2. Abrir o Projeto
3. Configuração de criação do arquivo .jar
   * Abrir a estrutura do Projeto
   * Clicar em ARTIFACTS
   * Clicar no +
   * Selecionar JAR
   * Escolha FROM MODULES WITH DEPENDENCIES
   * Achar o Projeto
   * Clicar OK
   * Marcar a opção "Include in project build"
   * Clicar em APLY
   * Clicar em OK
4. Criar o JAR
   * Vá para BUILD > BUILD ARTIFACTS
   * Ache e selecione o artefato recém-criado

## Passo a Passo para linkar o JAR a outros Projetos
1. Abra o Projeto no qual você quer linkar o Helpers
2. Abra a estrutura do projeto
3. Vá em LIBRARIES
4. Clique em + > Java
5. Navegue até a pasta onde o .jar foi criado (normalmente `projeto-helpers\out\artifacts`)
6. Selecione o .jar
7. Clique em APPLY e depois OK
8. (opcional) Adicione as Global Libraries no Plataform Settigns

## E se eu quiser Ampliar o Projeto?
Basta rebuildar o projeto helpers
