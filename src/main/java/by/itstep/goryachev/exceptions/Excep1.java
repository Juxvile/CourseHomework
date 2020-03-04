package by.itstep.goryachev.exceptions;


public class Excep1 {
    public static void main(String[] args) {
        int a = 1;
        if (a == 0) {
            try {
                throw new MyException("Ноль нельзя использовать");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            try {
                throw new MyException("Ничего нельзя!");
            }
            catch (MyException e) {
                e.printStackTrace();
            }
        }
        System.out.println("sddasdadasdadgfh");

    }
}

