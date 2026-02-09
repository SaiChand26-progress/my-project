package Oops;

public class Employee {
    String name;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Amit";
        d.salary = 60000;
        d.displayDetails();
    }
}
