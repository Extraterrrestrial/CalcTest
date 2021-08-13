package Kriger.Calculator;

import java.util.*;

class CalcTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, что нужно посчитать в виде 5 + 5 или V + V\nВводить нужно числа от 1 до 10:");
        String[] input_line = sc.nextLine().split(" ");
        if (input_line.length != 3 ) {
            System.out.println("Ошибка!");
            System.exit(1);
        }
        String str1 = input_line[0];
        String operand = input_line[1];
        String str2 = input_line[2];
        Calculate calculate = new Calculate();
        Checks check = new Checks();
        Convert convert = new Convert();

        if (check.exist_arabic(str1) && check.exist_arabic(str2) && operand.length() == 1) {
            System.out.println(calculate.calculate(Integer.valueOf(str1), Integer.valueOf(str2), operand.charAt(0)));
        } else if (check.exist_rome(str1) && check.exist_rome(str2) && operand.length() == 1){
            System.out.println(convert.arabic_to_rome(calculate.calculate(convert.rome_to_arabic(str1), convert.rome_to_arabic(str2), operand.charAt(0))));
        } else {
            System.out.println("Ошибка!");
        }
    }
}
