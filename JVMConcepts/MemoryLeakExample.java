package JVMConcepts;

import java.util.*;

public class MemoryLeakExample {

    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            list.add(new Object());
        }
    }
}