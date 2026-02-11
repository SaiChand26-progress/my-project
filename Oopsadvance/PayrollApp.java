package Oopsadvance;

interface Employee{
    double salary();
}

class FullTime implements Employee{

    public double salary(){
        return 50000;
    }
}

public class PayrollApp{

    public static void main(String[] args){

        Employee e = new FullTime();

        System.out.println("Salary = " + e.salary());
    }
}
