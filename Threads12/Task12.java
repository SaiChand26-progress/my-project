package Threads12;

import java.util.concurrent.*;

class InterestTask implements Callable<Double> {

    private double amount;

    InterestTask(double amount) {
        this.amount = amount;
    }

    public Double call() {
        return amount * 0.05;
    }
}

public class Task12 {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(3);

        Future<Double> f1 = service.submit(new InterestTask(10000));
        Future<Double> f2 = service.submit(new InterestTask(20000));
        Future<Double> f3 = service.submit(new InterestTask(30000));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        service.shutdown();
    }
}
