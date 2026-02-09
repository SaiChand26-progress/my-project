package Arrays;

public class task6 {
     public static void main(String[] args) {

        int[] marks = {95,67,120,-5,45,80};

        int pass=0, fail=0;

        for(int m : marks){

            if(m < 0 || m > 100){
                System.out.println("Invalid mark detected: "+m);
                continue;
            }

            if(m >= 50) pass++;
            else fail++;
        }

        System.out.println("Pass: "+pass);
        System.out.println("Fail: "+fail);
    }
}
