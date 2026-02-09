package Arrays;

public class task8 {
    public static void main(String[] args) {

        int[] status = {1,1,0,0,0,1,0,0};

        int downtime=0;
        int longest=0;
        int current=0;

        for(int s : status){

            if(s==0){
                downtime++;
                current++;
                longest = Math.max(longest,current);
            }else{
                current=0;
            }
        }

        System.out.println("Total Downtime Hours: "+downtime);
        System.out.println("Longest Continuous Downtime: "+longest);
    }
}
