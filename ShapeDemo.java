
abstract class MyShape {

    abstract void draw();
}

class Circle extends MyShape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends MyShape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends MyShape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        MyShape circle = new Circle();
        MyShape rectangle = new Rectangle();
        MyShape triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}