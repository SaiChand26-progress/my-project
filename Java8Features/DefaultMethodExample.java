package Java8Features;

interface Demo {
    default void show() {
        System.out.println("Default Method Executed");
    }
}

public class DefaultMethodExample implements Demo {
    public static void main(String[] args) {

        DefaultMethodExample obj = new DefaultMethodExample();
        obj.show();
    }
}