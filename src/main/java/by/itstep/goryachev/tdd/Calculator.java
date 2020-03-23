package by.itstep.goryachev.tdd;


public interface Calculator {
    int sum (int a, int b);
//    вычитание
    int diff (int a, int b);
//    умножение
    int mul (int a, int b);
//    деление
    void div (int a, int b);
}

class Run {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calculator.div(1,0);

    }
}

