package Kriger.Calculator;

public class Checks {

    public static boolean exist_rome(String arr_str) {
        String[] massStringA = {"I","II","III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String symbol_in_arr : massStringA) {
            if (arr_str.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean exist_arabic(String arr_str) {
        String[] massStringA = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String symbol_in_arr : massStringA) {
            if (arr_str.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }


}
