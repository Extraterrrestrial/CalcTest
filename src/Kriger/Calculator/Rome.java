package Kriger.Calculator;

public class Rome {

    public static boolean rome(String arrstr) {
        String[] massStringA = {"I","II","III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String symbol_in_arr : massStringA) {
            if (arrstr.equals(symbol_in_arr)) {
                return true;
            }
        }
        return false;
    }

}
