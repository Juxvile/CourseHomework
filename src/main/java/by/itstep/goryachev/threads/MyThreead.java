package by.itstep.goryachev.threads;

public class MyThreead {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Thread thread = new Thread(new CountThread(new MyClass()));
            thread.setName("Thread" + i);
            thread.start();

        }
    }
}


class MyClass {
    int num;
}



class CountThread implements Runnable {

    MyClass myClass;

    public CountThread(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        synchronized (myClass) {
        myClass.num = 1;
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " start");
            System.out.println(Thread.currentThread().getName() + " " + myClass.num);
            myClass.num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
    }
}