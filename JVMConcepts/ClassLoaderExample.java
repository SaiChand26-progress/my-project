package JVMConcepts;

public class ClassLoaderExample {

    public static void main(String[] args) {

        ClassLoader loader =
                ClassLoaderExample.class.getClassLoader();

        System.out.println(loader);
    }
}