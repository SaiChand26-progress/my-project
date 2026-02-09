package Oops;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius = 5;

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    double side = 4;

    public double calculateArea() {
        return side * side;
    }

    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Square Area: " + s.calculateArea());
    }
}

