package by.itstep.goryachev.generic;


public class Box {
    private int id;

    private Object o;

    public Box(Object o) {
        this.o = o;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Box() {
    }

    public Box(int id) {
        this.id = id;
    }
}
