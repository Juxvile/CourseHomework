//package by.itstep.goryachev.threads;
//
//
//public class StoreMain {
//}
//
//
//class Store {
//    private int car = 0;
//
//    public synchronized void addCar() {
//        while (car < 1) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            car++;
//        }
//    }
//}
//
//
//class saleCar {
//    while (car >= 6) {
//        System.out.println();
//    }
//
//    public synchronized void addCar() {
//        while (car < 1) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            car++;
//        }
//    }
//}