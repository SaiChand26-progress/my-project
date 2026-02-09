package Arrays;

public class task2 {
    public static void main(String[] args) {

        int[] cpu = {65,70,80,55,90,60,75};

        int highest = cpu[0];
        int lowest = cpu[0];
        int sum = 0;

        for(int load : cpu){
            if(load > highest) highest = load;
            if(load < lowest) lowest = load;
            sum += load;
        }

        double avg = (double) sum / cpu.length;

        System.out.println("Highest Load: " + highest);
        System.out.println("Lowest Load: " + lowest);
        System.out.println("Average Load: " + avg);
    }
}
