package Oops;

public class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        System.out.println("Area: " + r.calculateArea());
    }
}
