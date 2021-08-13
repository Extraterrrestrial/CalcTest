package Kriger.Calculator;

class CalcException extends Exception {
    public CalcException(String message) {
        super("Ошибка Калькулятора: " + message);
    }
}
