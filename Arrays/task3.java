package Arrays;

public class task3 {
    public static void main(String[] args) {

        int[] attempts = {1,2,4,0,5,2};

        for(int i=0;i<attempts.length;i++){
            if(attempts[i] > 3){
                System.out.println("Alert! User "+i+" has too many failed attempts.");
            }
        }
    }
}
