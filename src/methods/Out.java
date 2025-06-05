package methods;

import style.Color;

/**
 * Classe utilitária que fornece métodos para saída formatada de texto e manipulação de tempo.
 * Esta classe contém métodos para exibir mensagens de erro, centralizar texto e pausar a execução.
 * Todos os métodos são estáticos e podem ser acessados diretamente através da classe.
 */
public class Out {
    /**
     * Formata uma mensagem de erro com uma dica adicional.
     *
     * @param msg  A mensagem de erro principal
     * @param hint A dica para resolver o erro
     * @return Uma string formatada com a mensagem de erro em vermelho e a dica em amarelo
     */
    public static String erro(String msg, String hint) {
        return String.format("%s\n%s\n", Color.inRed("ERRO: " + msg), Color.inYellow("DICA: " + hint));
    }

    /**
     * Formata uma mensagem de erro simples.
     *
     * @param msg A mensagem de erro
     * @return Uma string formatada com a mensagem de erro em vermelho
     */
    public static String erro(String msg) {
        return Color.inRed("ERRO: " + msg + '\n');
    }

    /**
     * Retorna uma mensagem de erro padrão para entrada inválida.
     *
     * @return Uma string formatada com a mensagem "ERRO: entrada inválida" em vermelho
     */
    public static String erro() {
        return Color.inRed("ERRO: entrada inválida\n");
    }

    /**
     * Pausa a execução do programa por um determinado número de segundos.
     *
     * @param s O número de segundos para pausar a execução
     * @throws RuntimeException Se a thread for interrompida durante o sono
     */
    public static void sleep(double s) {
        try {
            Thread.sleep((int) (s * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Centraliza um texto com uma largura específica e um caractere de preenchimento personalizado.
     *
     * @param txt           O texto a ser centralizado
     * @param largura       A largura total da linha
     * @param preenchimento O caractere ou string a ser usado para preenchimento
     * @return Uma string com o texto centralizado
     */
    public static String center(String txt, int largura, String preenchimento) {
        int espacoLivre = largura - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + preenchimento.repeat(espacoLivre / 2) + " " + txt + " " + preenchimento.repeat(espacoLivre / 2) + extra;
    }

    /**
     * Centraliza um texto com um caractere de preenchimento personalizado e largura padrão de 50.
     *
     * @param txt           O texto a ser centralizado
     * @param preenchimento O caractere ou string a ser usado para preenchimento
     * @return Uma string com o texto centralizado com largura de 50 caracteres
     */
    public static String center(String txt, String preenchimento) {
        int espacoLivre = 50 - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + preenchimento.repeat(espacoLivre / 2) + " " + txt + " " + preenchimento.repeat(espacoLivre / 2) + extra;
    }

    /**
     * Centraliza um texto com uma largura específica e caractere de preenchimento padrão "=".
     *
     * @param txt     O texto a ser centralizado
     * @param largura A largura total da linha
     * @return Uma string com o texto centralizado usando "=" como preenchimento
     */
    public static String center(String txt, int largura) {
        int espacoLivre = largura - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + "=".repeat(espacoLivre / 2) + " " + txt + " " + "=".repeat(espacoLivre / 2) + extra;
    }

    /**
     * Centraliza um texto com largura padrão de 50 e caractere de preenchimento padrão "=".
     *
     * @param txt O texto a ser centralizado
     * @return Uma string com o texto centralizado com largura de 50 caracteres usando "=" como preenchimento
     */
    public static String center(String txt) {
        int espacoLivre = 50 - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + "=".repeat(espacoLivre / 2) + " " + txt + " " + "=".repeat(espacoLivre / 2) + extra;
    }

    /**
     * Método de teste que retorna uma mensagem padrão.
     *
     * @return A string "Testando..."
     */
    public static String test() {
        return "Testando...";
    }
}
