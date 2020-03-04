package by.itstep.goryachev.massiv;


import java.util.Arrays;

public class Massivi {
    public static void main(String[] args) {
//        int a, b, c;
//        int [] arrayOfint;
//        String [] arrayOfString;
//        arrayOfint = new int [10];
//        arrayOfString = new String[10];
//        arrayOfint [0] = 2;
//        arrayOfint [1] = 3;
//        arrayOfint [2] = 4;
//        arrayOfint [3] = 5;
//        arrayOfint [4] = 6;
//        System.out.println(arrayOfint [2]);
//
//        for (int i = 0; i < arrayOfString.length; i++) {
//            arrayOfString [i] = "string" + i;
//        }
//        for (String str : arrayOfString) {
//        System.out.println(str); }
//        int [] arrIntTwo = new int []{1, 4, 6, 3, 2, 8};
//        for (int numb : arrIntTwo) {
//            System.out.println(numb);}
//        String [] arrStr = new String [] {"sdadas", "fdsfdsfdfds", "fdfsdfdfsdfsfds"};
//        System.out.println(arrStr[2]);
//        int [] arrIntThree = new int []{1, 4, 6, 3, 2, 8};
//        for (int numbe : arrIntThree) {
//            System.out.println(numbe);}
//
//        int [][] arrInt = {{1, 2, 3 , 4, 5, 6, 7},{10 ,20, 30, 40, 50, 60, 70}};
//        System.out.println(arrInt[0][5]);
//        System.out.println(arrInt[1][5]);
//        System.out.println(arrInt[0].length);

//        for (int i = 0; i < arrInt.length; i++) {
//            for (int j = 0; j < arrInt[i].length; j++) {
//                System.out.print(arrInt[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        for (int[] arrItem : arrInt) {
//            for (int arrItem2 : arrItem) {
//                System.out.print(arrItem2 + " ");
//            }
//            System.out.println();
//        }
        int [] arrInt = {1, 2, 3, 4, 5, 6, 7};
        int [] arrInt2 = arrInt.clone();
        arrInt [1] = 100;
        String str = Arrays.toString(arrInt);
        System.out.println(str);
        System.out.println(Arrays.toString(arrInt2));
        System.out.println(Arrays.binarySearch(arrInt2, 100));
//                new int [arrInt.length];
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt2[i] = arrInt[i];
//        }
//        for (int i : arrInt){
//            System.out.print(i + " ");
//        }
//            System.out.println();
//        arrInt2[5] = 9;
//        for (int j : arrInt2){
//        System.out.print(j + " ");
//
//        }
    }
}
