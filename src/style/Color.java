package style;

/**
 * Classe utilitária para manipulação de cores e estilos de texto na saída do console.
 * Fornece constantes e métodos para aplicar cores, estilos e fundos ao texto.
 */
public class Color {
    /**
     * Constantes de cores de texto para saída do console.
     * Essas constantes podem ser usadas para alterar a cor do texto no console.
     */
    /**
     * Redefine todas as configurações de cor e estilo para o padrão.
     */
    public static final String RESET = "\u001B[0;0m";

    /**
     * Cor de texto azul.
     */
    public static final String AZUL = "\u001B[94m";

    /**
     * Cor de texto verde.
     */
    public static final String VERDE = "\u001B[92m";

    /**
     * Cor de texto vermelho (negrito).
     */
    public static final String VERMELHO = "\u001B[1;31m";

    /**
     * Cor de texto amarelo.
     */
    public static final String AMARELO = "\u001B[93m";

    /**
     * Cor de texto magenta.
     */
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Cor de texto ciano.
     */
    public static final String CIANO = "\u001B[36m";

    /**
     * Cor de texto preto.
     */
    public static final String PRETO = "\u001B[30m";

    /**
     * Constantes de estilo de texto para saída do console.
     * Essas constantes podem ser usadas para alterar o estilo do texto no console.
     */
    /**
     * Estilo de texto negrito.
     */
    public static final String NEGRITO = "\u001B[1m";

    /**
     * Estilo de texto sublinhado.
     */
    public static final String SUBLINHADO = "\u001B[4m";

    /**
     * Estilo de texto itálico.
     */
    public static final String ITALICO = "\033[3m";

    /**
     * Constantes de cor de fundo para saída do console.
     * Essas constantes podem ser usadas para alterar a cor de fundo do texto no console.
     */
    /**
     * Redefine a cor de fundo para o padrão.
     */
    public static final String BGRESET = "\u001B[0m";

    /**
     * Cor de fundo preto.
     */
    public static final String BGPRETO = "\u001B[40m";

    /**
     * Cor de fundo vermelho.
     */
    public static final String BGVERMELHO = "\u001B[41m";

    /**
     * Cor de fundo verde.
     */
    public static final String BGVERDE = "\u001B[42m";

    /**
     * Cor de fundo amarelo.
     */
    public static final String BGAMARELO = "\u001B[43m";

    /**
     * Cor de fundo azul.
     */
    public static final String BGAZUL = "\u001B[44m";

    /**
     * Cor de fundo magenta.
     */
    public static final String BGMAGENTA = "\u001B[45m";

    /**
     * Cor de fundo ciano.
     */
    public static final String BGCIANO = "\u001B[46m";

    /**
     * Cor de fundo branco.
     */
    public static final String BGBRANCO = "\u001B[47m";

    /**
     * Métodos para aplicar cores de texto às strings.
     * Esses métodos envolvem o texto fornecido com os códigos de cor apropriados.
     */
    /**
     * Aplica a cor azul ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor azul aplicada
     */
    public static String inBlue(String txt) {
        return Color.AZUL + txt + Color.RESET;
    }

    /**
     * Aplica a cor verde ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor verde aplicada
     */
    public static String inGreen(String txt) {
        return Color.VERDE + txt + Color.RESET;
    }

    /**
     * Aplica a cor vermelha ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor vermelha aplicada
     */
    public static String inRed(String txt) {
        return Color.VERMELHO + txt + RESET;
    }

    /**
     * Aplica a cor amarela ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor amarela aplicada
     */
    public static String inYellow(String txt) {
        return Color.AMARELO + txt + Color.RESET;
    }

    /**
     * Aplica a cor magenta ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor magenta aplicada
     */
    public static String inMagenta(String txt) {
        return Color.MAGENTA + txt + Color.RESET;
    }

    /**
     * Aplica a cor ciano ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor ciano aplicada
     */
    public static String inCyan(String txt) {
        return Color.CIANO + txt + Color.RESET;
    }

    /**
     * Aplica a cor preta ao texto fornecido.
     *
     * @param txt O texto a ser colorido
     * @return O texto com a cor preta aplicada
     */
    public static String inBlack(String txt) {
        return Color.PRETO + txt + Color.RESET;
    }

    /**
     * Redefine a cor do texto para normal.
     *
     * @param txt O texto a ser redefinido
     * @return O texto com cor normal
     */
    public static String normal(String txt) {
        return Color.RESET + txt;
    }

    /**
     * Métodos para aplicar estilos de texto às strings.
     * Esses métodos envolvem o texto fornecido com os códigos de estilo apropriados.
     */

    /**
     * Aplica o estilo negrito ao texto fornecido.
     *
     * @param txt O texto a ser estilizado
     * @return O texto com estilo negrito aplicado
     */
    public static String bold(String txt) {
        return Color.NEGRITO + txt + Color.RESET;
    }

    /**
     * Aplica o estilo sublinhado ao texto fornecido.
     *
     * @param txt O texto a ser estilizado
     * @return O texto com estilo sublinhado aplicado
     */
    public static String underlined(String txt) {
        return Color.SUBLINHADO + txt + Color.RESET;
    }

    /**
     * Aplica o estilo itálico ao texto fornecido.
     *
     * @param txt O texto a ser estilizado
     * @return O texto com estilo itálico aplicado
     */
    public static String italic(String txt) {
        return Color.ITALICO + txt + Color.RESET;
    }

    /**
     * Métodos para aplicar cores de fundo às strings.
     * Esses métodos envolvem o texto fornecido com os códigos de cor de fundo apropriados.
     */

    /**
     * Aplica a cor de fundo azul ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo azul aplicado
     */
    public static String inBlueBg(String txt) {
        return Color.BGAZUL + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo verde ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo verde aplicado
     */
    public static String inGreenBg(String txt) {
        return Color.BGVERDE + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo vermelha ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo vermelho aplicado
     */
    public static String inRedBg(String txt) {
        return Color.BGVERMELHO + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo amarela ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo amarelo aplicado
     */
    public static String inYellowBg(String txt) {
        return Color.BGAMARELO + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo magenta ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo magenta aplicado
     */
    public static String inMagentaBg(String txt) {
        return Color.BGMAGENTA + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo ciano ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo ciano aplicado
     */
    public static String inCyanBg(String txt) {
        return Color.BGCIANO + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo preta ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo preto aplicado
     */
    public static String inBlackBg(String txt) {
        return Color.BGPRETO + txt + Color.BGRESET;
    }

    /**
     * Aplica a cor de fundo branca ao texto fornecido.
     *
     * @param txt O texto para ter o fundo colorido
     * @return O texto com fundo branco aplicado
     */
    public static String inWhiteBg(String txt) {
        return Color.BGBRANCO + txt + Color.BGRESET;
    }

    /**
     * Redefine a cor de fundo para normal.
     *
     * @param txt O texto para ter o fundo redefinido
     * @return O texto com fundo normal
     */
    public static String normalBg(String txt) {
        return Color.BGRESET + txt;
    }

    /**
     * Métodos mistos que combinam múltiplos efeitos de cor e estilo.
     */

    /**
     * Cria um efeito negativo (fundo branco, texto preto, negrito) para a string fornecida.
     *
     * @param value A string para aplicar o efeito negativo
     * @return A string com efeito negativo aplicado
     */
    public static String negative(String value) {
        return bold(inWhiteBg(inBlack(value)));
    }
}
