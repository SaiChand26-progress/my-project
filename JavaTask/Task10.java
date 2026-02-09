package JavaTask;

public class Task10 {
     public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            if(i == 3){
                System.out.println("Skipping invalid record: " + i);
                continue;
            }

            if(i == 8){
                System.out.println("Critical error at record " + i);
                break;
            }

            System.out.println("Processing record: " + i);
        }
    }
}
