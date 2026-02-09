
package Arrays;

public class task10 {
     public static void main(String[] args) {

        int[] source = {1,2,3,4,5};
        int[] dest   = {1,2,0,4,5};

        boolean identical = true;

        for(int i=0;i<source.length;i++){
            if(source[i] != dest[i]){
                identical = false;
                System.out.println("Mismatch at index "+i);
            }
        }

        if(identical){
            System.out.println("Arrays are identical");
        }
    }
}
