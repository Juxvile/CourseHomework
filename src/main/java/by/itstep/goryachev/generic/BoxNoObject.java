package by.itstep.goryachev.generic;


public class BoxNoObject {
    private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public BoxNoObject(Object o) {
        this.o = o;
    }

    public BoxNoObject() {
    }


    public void print() {
        System.out.println("Hello");
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void print(int i) {
        System.out.println(i);

    }

    public <T> void print(T t) {
        System.out.println(t);
    }
}
