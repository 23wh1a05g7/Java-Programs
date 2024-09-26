// Interface Shape
interface Shape {
    void printArea();
}

// Class Rectangle implementing Shape
class Rectangle implements Shape {
    private int length;
    private int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void printArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Class Triangle implementing Shape
class Triangle implements Shape {
    private int base;
    private int height;

    // Constructor to initialize base and height
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Class Circle implementing Shape
class Circle implements Shape {
    private int radius;

    // Constructor to initialize radius
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", area);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape triangle = new Triangle(4, 8);
        Shape circle = new Circle(7);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
