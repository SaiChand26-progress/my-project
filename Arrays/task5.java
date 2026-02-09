package Arrays;

import java.util.HashMap;

public class task5 {
    public static void main(String[] args) {

        int[] errors = {500,404,500,200,404,500};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int code : errors){
            map.put(code, map.getOrDefault(code,0)+1);
        }

        int maxCount = 0;
        int frequent = 0;

        for(int code : map.keySet()){
            int count = map.get(code);
            System.out.println(code+" occurred "+count+" times");

            if(count > maxCount){
                maxCount = count;
                frequent = code;
            }
        }

        System.out.println("Most Frequent Error Code: "+frequent);
    }
}
