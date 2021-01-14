import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        int n1 = 0;
        int n2 = 0;

        String[] parts = s.split("[+\\-\\*\\/]");

        try {
            n1 = Integer.parseInt(parts[0].trim());
        } catch (Exception sa) {
            try {
                n2 = Integer.parseInt(parts[1].trim());
            } catch (Exception asd) {
                n1 = RomanConverter.romanToInt(parts[0].trim());
                n2 = RomanConverter.romanToInt(parts[1].trim());
                System.out.println(IntConverterResult.convertIntegerToRoman(results(n1, n2, s)));
                return;
            }
            throw new RuntimeException("Неверный формат");
        }
        try {
            n2 = Integer.parseInt(parts[1].trim());
        }catch (Exception sd){
            throw new RuntimeException("Неверный формат");
        }
        System.out.println(results(n1, n2, s));
    }

    public static int results(int n1, int n2, String s) {

        int result = 0;

        if (n1 >= 1 && n1 <= 10 && n2 >= 1 && n2 <= 10) {

            if (s.contains("+")) {
                result = n1 + n2;
            }

            if (s.contains("-")) {
                result = n1 - n2;
            }

            if (s.contains("*")) {
                result = n1 * n2;
            }

            if (s.contains("/")) {
                result = n1 / n2;
            }

        } else {
            throw new RuntimeException("Неверное число");
        }
        return result;
    }
}




