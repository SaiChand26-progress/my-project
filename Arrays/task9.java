package Arrays;

public class task9 {
    public static void main(String[] args) {

        int[] response = {1200,2500,800,3000,1500};

        int sum=0;

        for(int r:response){

            if(r>2000){
                System.out.println("Slow API detected: "+r+" ms");
            }

            sum+=r;
        }

        double avg = (double)sum/response.length;

        System.out.println("Average Response Time: "+avg+" ms");
    }
}
