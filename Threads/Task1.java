package Threads;

class UserLogin extends Thread {

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    " Login started at: " + System.currentTimeMillis());

            Thread.sleep(2000); // authentication delay

            System.out.println(Thread.currentThread().getName() +
                    " Login Successful!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {

        UserLogin[] users = new UserLogin[10];

        for (int i = 0; i < 10; i++) {
            users[i] = new UserLogin();

            System.out.println("Before start: " + users[i].getState());

            users[i].start();

            System.out.println("After start: " + users[i].getState());
        }
    }
}
