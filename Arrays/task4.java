package Arrays;

public class task4 {
    public static void main(String[] args) {

        double[] salaries = {30000,40000,50000,45000};

        for(int i=0;i<salaries.length;i++){
            salaries[i] += salaries[i] * 0.10;
            System.out.println("Updated Salary: " + salaries[i]);
        }
    }
}
