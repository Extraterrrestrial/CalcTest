package Kriger.Calculator;

import java.util.*;

class CalcTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        Checks check = new Checks();
        Convert convert = new Convert();

        System.out.println("Введите, что нужно посчитать в виде 5 + 5 или V + V\nВводить нужно числа от 1 до 10\nДля завершения работы калбкулятора введите x:");

        while (true) {
            System.out.print(">");
            String input_str = sc.nextLine();
            if (input_str.equals("x") || input_str.equals("X") || input_str.equals("х") || input_str.equals("Х")) {
                System.out.println("Работа калькулятора завершена!");
                System.exit(1);
            }
            String[] input_line = input_str.split(" ");
            if (input_line.length != 3) {
                System.out.println("Ошибка!");
                System.exit(1);
            }
            String str1 = input_line[0];
            String operate = input_line[1];
            String str2 = input_line[2];

            if (check.exist_arabic(str1) && check.exist_arabic(str2) && operate.length() == 1) {
                System.out.println("Ответ= " + calculate.calculate(Integer.valueOf(str1), Integer.valueOf(str2), operate.charAt(0)));
            } else if (check.exist_rome(str1) && check.exist_rome(str2) && operate.length() == 1) {
                System.out.println("Ответ= " + convert.arabic_to_rome(calculate.calculate(convert.rome_to_arabic(str1), convert.rome_to_arabic(str2), operate.charAt(0))));
            } else {
                System.out.println("Ошибка!");
                System.exit(1);
            }
        }
    }
}
