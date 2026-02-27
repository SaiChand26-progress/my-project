package JVMConcepts;

class Person {
    String name;
}

public class HeapStackExample {

    public static void main(String[] args) {

        int x = 10; // Stack
        Person p = new Person(); // Object in Heap

        p.name = "Sai";

        System.out.println(p.name);
    }
}