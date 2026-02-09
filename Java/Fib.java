package Java;

public class Fib {
    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

}
