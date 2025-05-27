package methods;

import java.util.Arrays;

/**
 * Classe que fornece métodos para validação de documentos brasileiros.
 * Atualmente suporta validação de CPF (Cadastro de Pessoas Físicas).
 */
public class Documents {
    /**
     * Verifica se um CPF é válido.
     * 
     * Este método realiza a validação de um CPF seguindo o algoritmo oficial:
     * 1. Remove caracteres não numéricos (como pontos, traços e letras)
     * 2. Verifica se o CPF possui 11 dígitos
     * 3. Calcula os dígitos verificadores e compara com os dígitos fornecidos
     * 
     * @param cpf String contendo o CPF a ser validado (pode conter pontuação)
     * @return true se o CPF for válido, false caso contrário
     */
    public static boolean verifyCpf(String cpf) {
        //variables and arrays
        cpf = cpf.replaceAll("[-. A-Za-z]", "");
        String[] chars = cpf.split("");
        int[] digits = new int[11];
        int[] newDigits;
        int counter, sum = 0;
        int verifier1, verifier2;

        if (cpf.length() != 11) {
            return false;
        }

        //loops
        for (int i = 0; i < chars.length; i++) {
            digits[i] = Integer.parseInt(chars[i]);
        }

        for (int i = 0; i < digits.length - 2; i++) {
            counter = 10 - i;
            sum += digits[i] * counter;
        }
        verifier1 = (11 - sum % 11 < 10) ? 11 - sum % 11 : 0;
        newDigits = Arrays.copyOf(digits, digits.length - 1);
        newDigits[digits.length - 2] = verifier1;

        sum = 0;
        for (int i = 0; i < newDigits.length; i++) {
            counter = 11 - i;
            sum += newDigits[i] * counter;
        }
        verifier2 = (11 - sum % 11 < 10) ? 11 - sum % 11 : 0;

        return verifier1 == digits[9] && verifier2 == digits[10];
    }
    /**
     * Verifica se um CPF é válido.
     * 
     * Este método é uma sobrecarga que aceita o CPF como um número longo.
     * Converte o número para string e utiliza o método {@link #verifyCpf(String)}.
     * 
     * @param cpf Número longo contendo o CPF a ser validado (sem pontuação)
     * @return true se o CPF for válido, false caso contrário
     */
    public static boolean verifyCpf(long cpf) {
        return verifyCpf(String.valueOf(cpf));
    }
}
