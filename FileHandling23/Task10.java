package FileHandling23;

import java.io.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Task10 {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101, "Ravi");

        // Serialize
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("student.ser"));

        oos.writeObject(s1);
        oos.close();

        System.out.println("Object Serialized.");

        // Deserialize
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.ser"));

        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println("Deserialized Data:");
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
    }
}