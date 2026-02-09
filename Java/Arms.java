package Java;

public class Arms {
     public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }

}
