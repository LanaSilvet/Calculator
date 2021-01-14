import java.io.IOException;

public class RomanConverter {

    public static int romanToInt(String s) throws IOException {

        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int i = 0; i < 10; i++){
            if (romans[i].equals(s)) {
                return (i + 1);
            }
        }
        return 0;
    }

}


