package by.itstep.goryachev.oldTasks;

public class Loops {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                System.out.println("fizz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }
//        System.out.println("End of the Loop");
//        int [] arr = {1, 3, 5, 6, 9};
//        for (int i = 0; i <= arr.length; i++); {
//        System.out.println(arr[i]);
//        }
//        int i = 0;
//        boolean bool = true;
//        while (bool) {
//            if (i == 90)
//            { bool = false;}
//            else {
//                System.out.println(i);
//                i++;
//            }
//    }
//        do {
//            System.out.println("sfasfsf");
//
//            i++;
//            if (i == 100) ;
//            bool = false;
//            System.out.println("sfasfsf " + i);
//        }
//        while (bool);
        System.out.println(2);
        System.out.println(3);

        for (int i = 3; i <= 1000000; i +=2) {
            for (int j = 3; j <= Math.sqrt(i)+1; j +=2){
                if (i % j ==0) {
                    break;
                }
                if ( j + 1 >= Math.sqrt(i)) {

                }
            }
            int k = (int) Math.sqrt(i);
            if (i % k != 0) {
                System.out.println(i);

            }
        }
        }
    }

