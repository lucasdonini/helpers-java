import style.Style;

import java.util.Map;

public class Testes {
    public static void main(String[] args) {
        Style s = new Style();
        s.addStyle("background-color", "black");
        s.addStyle("color", "red");
        s.setDefaultStyle(Map.of("font-style", "deleted bold underlined"));

        System.out.println(s.applyOn("Hello World"));

        s.addStyle(Map.of("font-style", "italic bold deleted", "color", "blue", "background-color", "green"));

        System.out.println(s.applyOn("Hello again world"));

        s.clearStyle();

        System.out.println(s.applyOn("Hello world, another time"));

        s.resetDefaultStyle();
        s.clearStyle();

        System.out.println(s.applyOn("Farewell, for now"));
    }
}
