package style;

public class Color {
    //Cores de texto
    public static final String RESET = "\u001B[0;0m";
    public static final String AZUL = "\u001B[94m";
    public static final String VERDE = "\u001B[92m";
    public static final String VERMELHO = "\u001B[1;31m";
    public static final String AMARELO = "\u001B[93m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIANO = "\u001B[36m";
    public static final String PRETO = "\u001B[30m";

    //Estilos
    public static final String NEGRITO = "\u001B[1m";
    public static final String SUBLINHADO = "\u001B[4m";
    public static final String ITALICO = "\033[3m";

    //Backgrounds
    public static final String BGRESET = "\u001B[0m";
    public static final String BGPRETO = "\u001B[40m";
    public static final String BGVERMELHO = "\u001B[41m";
    public static final String BGVERDE = "\u001B[42m";
    public static final String BGAMARELO = "\u001B[43m";
    public static final String BGAZUL = "\u001B[44m";
    public static final String BGMAGENTA = "\u001B[45m";
    public static final String BGCIANO = "\u001B[46m";
    public static final String BGBRANCO = "\u001B[47m";

    //Métodos de alteração de cor
    public static String inBlue(String txt) {
        return Color.AZUL + txt + Color.RESET;
    }

    public static String inGreen(String txt) {
        return Color.VERDE + txt + Color.RESET;
    }

    public static String inRed(String txt) {
        return Color.VERMELHO + txt + RESET;
    }

    public static String inYellow(String txt) {
        return Color.AMARELO + txt + Color.RESET;
    }

    public static String inMagenta(String txt) {
        return Color.MAGENTA + txt + Color.RESET;
    }

    public static String inCyan(String txt) {
        return Color.CIANO + txt + Color.RESET;
    }

    public static String inBlack(String txt) {
        return Color.PRETO + txt + Color.RESET;
    }

    public static String normal(String txt) {
        return Color.RESET + txt;
    }

    //Métodos para alteração de estilo
    public static String bold(String txt) {
        return Color.NEGRITO + txt + Color.RESET;
    }

    public static String underlined(String txt) {
        return Color.SUBLINHADO + txt + Color.RESET;
    }

    public static String italic(String txt) {
        return Color.ITALICO + txt + Color.RESET;
    }

    //Métodos para alteração de backgroung
    public static String inBlueBg(String txt) {
        return Color.BGAZUL + txt + Color.BGRESET;
    }

    public static String inGreenBg(String txt) {
        return Color.BGVERDE + txt + Color.BGRESET;
    }

    public static String inRedBg(String txt) {
        return Color.BGVERMELHO + txt + Color.BGRESET;
    }

    public static String inYellowBg(String txt) {
        return Color.BGAMARELO + txt + Color.BGRESET;
    }

    public static String inMagentaBg(String txt) {
        return Color.BGMAGENTA + txt + Color.BGRESET;
    }

    public static String inCyanBg(String txt) {
        return Color.BGCIANO + txt + Color.BGRESET;
    }

    public static String inBlackBg(String txt) {
        return Color.BGPRETO + txt + Color.BGRESET;
    }

    public static String inWhiteBg(String txt) {
        return Color.BGBRANCO + txt + Color.BGRESET;
    }

    public static String normalBg(String txt) {
        return Color.BGRESET + txt;
    }

    //Métodos mistos
    public static String negative(String txt) {
        return bold(inWhiteBg(inBlack(txt)));
    }

    public static String negative(int x) {
        return bold(inWhiteBg(inBlack(String.valueOf(x))));
    }

}