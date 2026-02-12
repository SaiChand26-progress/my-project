package Oopsadvance;

class Doctor{
    String name;

    Doctor(String name){
        this.name=name;
    }
}

class Patient{

    String name;
    Doctor doctor;

    Patient(String n,Doctor d){
        name=n;
        doctor=d;
    }
}

public class HospitalApp{

    public static void main(String[] args){

        Doctor d = new Doctor("Dr.Reddy");

        Patient p = new Patient("Sai",d);

        System.out.println(p.name + " treated by " + p.doctor.name);
    }
}
