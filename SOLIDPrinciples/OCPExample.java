package SOLIDPrinciples;

interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }
    public double area() { return Math.PI * radius * radius; }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l; width = w;
    }
    public double area() { return length * width; }
}

public class OCPExample {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("Area: " + shape.area());
    }
}