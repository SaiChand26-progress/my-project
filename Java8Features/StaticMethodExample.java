package Java8Features;

interface Utility {
    static void display() {
        System.out.println("Static Method Inside Interface");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {

        Utility.display();
    }
}