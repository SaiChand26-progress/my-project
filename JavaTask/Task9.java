package JavaTask;

public class Task9 {
    public static void main(String[] args) {

        int attempts = 0;
        boolean success = false;

        while(attempts < 3){

            attempts++;
            System.out.println("Attempt " + attempts);

            if(Math.random() > 0.5){
                success = true;
                System.out.println("API Call Successful!");
                break;
            }
        }

        if(!success){
            System.out.println("API Failed after 3 attempts.");
        }
    }
}
