
//Abstraction in Java is a fundamental concept that allows you to represent the essential features of an object without including the implementation details. It helps to simplify complex systems by focusing on what an object does rather than how it does it.//
//Abstract Classes and interfaces//
//An abstract class is a class that cannot be instantiated directly and may contain abstract methods (methods without a body).//
//An interface is a reference type in Java that is similar to a class but contains only constants, method signatures, default methods, static methods, and nested types.//

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of circle: " + circle.calculateArea());
        rectangle.draw();
    }
}