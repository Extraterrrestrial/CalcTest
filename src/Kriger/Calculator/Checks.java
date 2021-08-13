package Kriger.Calculator;

public class Checks {

    public static boolean exist_rome(String arrstr) {
        String[] massStringA = {"I","II","III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String symbol_in_arr : massStringA) {
            if (arrstr.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean exist_arabic(String arrstr) {
        String[] massStringA = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String symbol_in_arr : massStringA) {
            if (arrstr.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }


}
