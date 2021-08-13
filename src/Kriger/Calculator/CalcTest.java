package Kriger.Calculator;

import java.util.*;

class CalcTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите, что нужно посчитать в виде 5 + 5 или V + V\nВводить нужно числа от 1 до 10\nДля завершения работы калбкулятора введите x:");
        try { //Обрабатываем исключения

            while (true) {
                System.out.print(">");
                String input_str = sc.nextLine();
                if (input_str.equals("x") || input_str.equals("X") || input_str.equals("х") || input_str.equals("Х")) {
                    System.out.println("Работа калькулятора завершена!");
                    System.exit(0);
                }
                String[] input_line = input_str.split(" ");
                if (input_line.length != 3) {
                    throw new CalcException("Неверный ввод");
                }
                String str1 = input_line[0];
                String operate = input_line[1];
                String str2 = input_line[2];

                if (Checks.exist_arabic(str1) && Checks.exist_arabic(str2) && operate.length() == 1) {
                    System.out.println("Ответ= " + Calculate.calculate(Integer.parseInt(str1), Integer.parseInt(str2), operate.charAt(0)));
                } else if (Checks.exist_rome(str1) && Checks.exist_rome(str2) && operate.length() == 1) {
                    System.out.println("Ответ= " + Convert.arabic_to_rome(Calculate.calculate(Convert.rome_to_arabic(str1), Convert.rome_to_arabic(str2), operate.charAt(0))));
                } else {
                    throw new CalcException("Неверный ввод");
                }
            }
        } catch (CalcException e) { //Исключения собственные
            System.out.println("\n" + e.getMessage());
        } catch (Exception e) { //Исключения системные
            System.out.println("\nАварийное завершение работы! Брошено исключение: " + e.getMessage());
        }
    }
}
