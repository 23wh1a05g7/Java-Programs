import java.util.Scanner;

class Area {
    private double radius;
    private double length;
    private double width;

    public Area(double radius, double length, double width) {
        this.radius = radius;
        this.length = length;
        this.width = width;
    }

    public double carea() {
        return Math.PI * radius * radius;
    }

    public double rarea() {
        return length * width;
    }

    public void displayAreas() {
        System.out.printf("Area of circle with radius %.2f is: %.2f%n", radius, carea());
        System.out.printf("Area of rectangle with length %.2f and width %.2f is: %.2f%n", length, width, rarea());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius, length, and width - ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Area area = new Area(radius, length, width);
        area.displayAreas();
    }
}
