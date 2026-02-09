package Arrays;

public class task1 {
    public static void main(String[] args) {

        int[] empIds = {101,102,103,104,105};

        System.out.println("Employee IDs:");
        for(int id : empIds){
            System.out.println(id);
        }

        System.out.println("Total Employees: " + empIds.length);
    }
}
