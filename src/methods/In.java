package methods;

public class In {
    public static boolean isInteger(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String entrada) {
        entrada = entrada.replace(",", ".");
        try {
            Double.parseDouble(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Ambas as funções acima não serão mais usadas para fazer verificação de entrada a maneira correta é usar o try{...} catch(...) {...} dentro do do{...} while(...); Manterei as funções criadas e os programas que a utilizam inalterados, como maneira de registrar o processo.
}