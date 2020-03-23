package by.itstep.goryachev.tdd;


public class CalculatorImpl implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public void div(int a, int b) {
        System.out.println((double) a / b);
    }

//    public static void main(String[] args) {
//        double a = 0.5555555555555555555555555555555555;
//        double b = 0.5;
//        System.out.println(a + b);
//    }
}

