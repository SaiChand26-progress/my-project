package JVMConcepts;

public class GarbageCollectorExample {

    protected void finalize() {
        System.out.println("Object Collected");
    }

    public static void main(String[] args) {
        GarbageCollectorExample obj = new GarbageCollectorExample();
        obj = null;
        System.gc();
    }
}