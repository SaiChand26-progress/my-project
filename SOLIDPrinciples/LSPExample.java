package SOLIDPrinciples;

class Bird {
    void eat() {
        System.out.println("Bird Eating");
    }
}

class Sparrow extends Bird {}

public class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.eat();
    }
}