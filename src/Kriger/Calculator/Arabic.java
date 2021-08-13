package Kriger.Calculator;

public class Arabic {

    public static boolean existArabic(String arrstr) {
        String[] massStringA = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String symbol_in_arr : massStringA) {
            if (arrstr.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }

}
