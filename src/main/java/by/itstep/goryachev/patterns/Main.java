package by.itstep.goryachev.patterns;

public class Main extends Thread{
    public static void main(String[] args) throws InterruptedException {

        Thread[] thread = new Thread[1000];
        for (int j = 0; j < 10000; j++) {
            for (int i = 0; i < 1000; i++) {
//            Singleton.getInstance();
                thread[i] = new Thread(() -> Singleton.getInstance());
                thread[i].start();
            }
            for (int i = 0; i < 1000; i++) {
                thread[i].join();
            }
            System.out.println(Singleton.count);
        }
//        Singleton instance1 = new Singleton();
//        Singleton.getInstance().printMessage();
////        System.out.println(Singleton.getInstance());
////        System.out.println(Singleton.getInstance());
//
//
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Singleton.getInstance());
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Singleton.getInstance());
//            }
//        });
//        thread1.start();
//        thread2.start();




    }
}
