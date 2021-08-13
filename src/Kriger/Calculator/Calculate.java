package Kriger.Calculator;

public class Calculate {

     public static int calculate(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Не верный знак операции!");
//                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }

}
