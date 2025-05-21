package methods;

import java.util.Arrays;

public class Documents {
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
    public static boolean verifyCpf(long cpf) {
        return verifyCpf(String.valueOf(cpf));
    }
}
