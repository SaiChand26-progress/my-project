package SOLIDPrinciples;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() { System.out.println("Working"); }
    public void eat() { System.out.println("Eating"); }
}

public class ISPExample {
    public static void main(String[] args) {
        Human h = new Human();
        h.work();
    }
}