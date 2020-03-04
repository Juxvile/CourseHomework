package by.itstep.goryachev.threads;


public class Main {
    public static void main(String[] args) {


//        System.out.println("It's main thread");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyTwoThread myTwoThread = new MyTwoThread();
//        Thread thread = new Thread(myTwoThread);
//        thread.start();
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myTwoThread.disable();
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            MyThread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
