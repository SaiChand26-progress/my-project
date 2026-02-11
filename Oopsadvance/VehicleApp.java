package Oopsadvance;

abstract class Vehicle{

    abstract double rent(int days);
}

class Car extends Vehicle{

    double rent(int days){
        return days * 2000;
    }
}

public class VehicleApp{

    public static void main(String[] args){

        Vehicle v = new Car();

        System.out.println("Rent = " + v.rent(3));
    }
}