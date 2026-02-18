package Strings16;

public class Task3 {
    public static void main(String[] args) {

        String csv = "101,Ravi,50000";

        String[] data = csv.split(",");

        System.out.println("ID: " + data[0] +
                " Name: " + data[1] +
                " Salary: " + data[2]);
    }
}
