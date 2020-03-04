package by.homework3;

public class Numb8 {
    public static void main(String[] args) {
        int x,y;
        StringBuilder number = new StringBuilder(5);
        for (int i = 0; i < 24; i++) {
            x = i / 10;
            y = i % 10;
            if (y > 5) {
                continue;
            }
            number.append(x).append(y).append(":").append(y).append(x);
            System.out.println(number);
            number.setLength(0);
        }
    }
}
