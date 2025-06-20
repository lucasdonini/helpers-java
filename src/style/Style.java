package style;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class Style {
    private final Map<String, Map<String, String>> properties;
    private final Map<String, String> fontColors;
    private final Map<String, String> fontStyles;
    private final Map<String, String> bgColors;
    private final String reset;
    private StringBuilder styleCode;
    private StringBuilder defaultStyleCode;

    // construtores
    public Style() {
        reset = "\u001B[0m" + "\u001B[22m" + "\u001B[23m" + "\u001B[24m";
        styleCode = new StringBuilder();
        defaultStyleCode = new StringBuilder();
        fontColors = Map.of(
                "black", "\u001B[30m",
                "red", "\u001B[31m",
                "green", "\u001B[32m",
                "yellow", "\u001B[33m",
                "blue", "\u001B[34m",
                "magenta", "\u001B[35m",
                "cyan", "\u001B[36m",
                "white", "\u001B[37m"
        );
        bgColors = Map.of(
                "black", "\u001B[40m",
                "red", "\u001B[41m",
                "green", "\u001B[42m",
                "yellow", "\u001B[43m",
                "blue", "\u001B[44m",
                "magenta", "\u001B[45m",
                "cyan", "\u001B[46m",
                "white", "\u001B[47m"
        );
        fontStyles = Map.of(
                "bold", "\u001B[1m",
                "italic", "\u001B[3m",
                "underlined", "\u001B[4m",
                "negative", "\u001B[7m",
                "deleted", "\u001B[9m"
        );
        properties = Map.of(
          "color", fontColors,
          "font-style", fontStyles,
          "background-color", bgColors
        );
    }

    // outros
    protected void addStyle(
            @NotNull String prop,
            @NotNull String val,
            @NotNull StringBuilder targetStringBuilder
    ) {
        if (!properties.containsKey(prop)) throw new IllegalArgumentException("Unknown property: " + prop);

        Map<String, String> propMap = properties.get(prop);

        for (String item : val.split("\\s+")) {
            if (!propMap.containsKey(item)) throw new IllegalArgumentException(String.format(
                    "Invalid value for property %s: %s", prop, item
            ));

            targetStringBuilder.append(propMap.get(item));
        }
    }

    public void addStyle(@NotNull String prop, @NotNull String val) {
        addStyle(prop, val, styleCode);
    }

    public void addStyle(@NotNull Map<String, String> props) {
        StringBuilder sb = new StringBuilder();
        props.forEach((prop, val) -> addStyle(prop, val, sb));
        styleCode.append(sb);
    }

    public void clearStyle() {
        styleCode = defaultStyleCode;
    }

    public void resetDefaultStyle() {
        defaultStyleCode = new StringBuilder();
    }

    public String applyOn(@Nullable String txt) {
        return styleCode + txt + reset;
    }

    public boolean hasStyle() {
        return styleCode.toString().isBlank();
    }

    public void setDefaultStyle(@NotNull Map<String, String> props) {
        props.forEach((prop, val) -> addStyle(prop, val, defaultStyleCode));
    }
}
