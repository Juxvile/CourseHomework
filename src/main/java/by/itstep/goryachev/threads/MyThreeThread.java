package by.itstep.goryachev.threads;

public class MyThreeThread {
    public static void main(String[] args) {
        System.out.println("Main Thread New");


        Thread thread = new Thread(new MyThreadThreadNewThread());
        thread.start();

        Thread threadTwo = new Thread(new MyThreadThreeRunnable());
        threadTwo.start();
    }
}

class MyThreadThreadNewThread extends Thread {
    @Override
    public void run(){
        System.out.println("Новый поток " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Конец потока 1");
    }
}

class MyThreadThreeRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Новый поток " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Конец потока 2");
    }
}
