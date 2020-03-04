package by.itstep.goryachev.threads;


public class MyThread extends Thread{
    @Override
    public void run(){

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName());
        int count = 1;
        while (!isInterrupted()) {
            System.out.println("Loop " + count++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
