package Oops;

public class Engine {
    String type = "Petrol";
}

class Car {
    String model = "Honda";
    Engine engine;

    Car() {
        engine = new Engine();
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.type);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.displayDetails();
    }
}

