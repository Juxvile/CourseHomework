package by.itstep.goryachev.patterns;

public class Delegate {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        triangle.draw();|
        Painter painter = new Painter();
        painter.paintFigure(new Triangle());
        painter.paintFigure(new Circle());
    }
}

interface Drawable {
    void draw();

}

class Triangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}

class Square implements Drawable {

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Painter {
    Drawable drawable;
    void paintFigure (Drawable drawable){
        drawable.draw();

    }
}