package doppractice;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "red", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "blue", false);
        Shape square = new Square(3.0, "green", true);

        System.out.println(circle);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println(rectangle);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println(square);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());
    }
}