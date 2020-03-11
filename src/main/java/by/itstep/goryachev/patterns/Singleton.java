package by.itstep.goryachev.patterns;


public class Singleton {

    public static int count = 0;

    private Singleton() {
        count++;
    }


    private static Singleton instance;
//    public static Singleton getInstance(){
//        return new Singleton();
//    }

//    public void printMessage() {
//        System.out.println("fgdfhdhhghgf");
//    }
//
    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
