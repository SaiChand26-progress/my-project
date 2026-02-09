package Arrays;

import java.util.HashSet;

public class task7 {
    public static void main(String[] args) {

        int[] tx = {111,222,333,111,444,222};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int id : tx){
            if(!seen.add(id)){
                duplicates.add(id);
            }
        }

        System.out.println("Duplicate Transactions:");
        for(int d : duplicates){
            System.out.println(d);
        }
    }
}
