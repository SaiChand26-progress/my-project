package JavaTask;

public class Task5 {
    static int totalLogins = 0; // static

    int sessionId; // instance

    Task5(int id){
        sessionId = id;
        totalLogins++;
    }

    void display(){
        System.out.println("Session ID: " + sessionId);
        System.out.println("Total Logins: " + totalLogins);
    }

    public static void main(String[] args) {

        Task5 user1 = new Task5(101);
        user1.display();

        Task5 user2 = new Task5(102);
        user2.display();
    }

}
