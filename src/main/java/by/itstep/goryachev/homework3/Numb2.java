package by.itstep.goryachev.homework3;


public class Numb2 {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;
        System.out.println("2");
        for (i=3; i < 100; i += 2) {
            isPrime = true;

            for (j=3; j < Math.sqrt(i); j += 2) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
