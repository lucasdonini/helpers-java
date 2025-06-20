package methods;

import style.Color;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class In {
    private static final Scanner input = new Scanner(System.in);

    public static String insert(String msg) {
        String s;

        do {
            System.out.print(msg);
            s = input.nextLine();

            if (s.isBlank()) {
                System.out.println(Out.erro(
                        "Entrada inválida",
                        "Não deixe o campo dem branco"
                ));
            }
        } while (s.isBlank());

        return s;
    }

    public static int insertInt(String msg) {
        boolean erro = true;
        int x = 0;

        do {
            System.out.print(msg);
            try {
                x = input.nextInt();
                input.nextLine(); //limpa o buffer
                erro = false;
            } catch (InputMismatchException ime) {
                System.out.println(Out.erro(
                        "Entrada inválida",
                        "Insira apenas números inteiros"
                ));
            } catch (Exception e) {
                System.out.println(Color.inRed(e.getMessage()));
            }
        } while (erro);

        return x;
    }

    public static LocalDate insertDate(String msg, String pattern) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
        LocalDate dt = LocalDate.EPOCH;
        String s;
        boolean erro = true;

        do {
            System.out.println("Formato: " + pattern);
            System.out.print(msg);
            try {
                s = input.next();
                input.nextLine(); //limpa o buffer
                dt = LocalDate.parse(s, format);
                erro = false;
            } catch (DateTimeParseException dtpe) {
                System.out.println(Out.erro(
                        "Data inválida",
                        "Certifique-se de que a data segue o formato especificado"
                ));
            } catch (Exception e) {
                System.out.println(Color.inRed(e.getMessage()));
            }
        } while (erro);

        return dt;
    }

    public static LocalDate insertDate(String msg) {
        return insertDate(msg, "yyyy-MM-dd");
    }
}
