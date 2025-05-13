package methods;

import style.Color;

public class Out {
    public static String erro(String msg, String hint) {
        return String.format("\n%s\n%s\n", Color.inRed("ERRO: " + msg), Color.inYellow("DICA: " + hint));
    }

    public static String erro(String msg) {
        return Color.inRed("\nERRO: " + msg);
    }

    public static String erro() {
        return Color.inRed("\nERRO: entrada inválida");
    }

    public static void sleep(double s) {
        try {
            Thread.sleep((int) (s * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String center(String txt, int largura, String preenchimento) {
        int espacoLivre = largura - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + preenchimento.repeat(espacoLivre / 2) + " " + txt + " " + preenchimento.repeat(espacoLivre / 2) + extra;
    }

    public static String center(String txt, String preenchimento) {
        int espacoLivre = 50 - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + preenchimento.repeat(espacoLivre / 2) + " " + txt + " " + preenchimento.repeat(espacoLivre / 2) + extra;
    }

    public static String center(String txt, int largura) {
        int espacoLivre = largura - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + "=".repeat(espacoLivre / 2) + " " + txt + " " + "=".repeat(espacoLivre / 2) + extra;
    }

    public static String center(String txt) {
        int espacoLivre = 50 - (txt.length() + 2);
        String extra = "";
        if (espacoLivre % 2 == 1) {
            extra = "=";
        }
        return "\n" + "=".repeat(espacoLivre / 2) + " " + txt + " " + "=".repeat(espacoLivre / 2) + extra;
    }

    public static String test() {
        return "Testando...";
    }
}
