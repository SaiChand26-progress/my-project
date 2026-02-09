package Oops;

    public class Student {
    private int id;
    private String name;
    private int marks;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else
            return 'C';
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Rahul");
        s.setMarks(85);

        System.out.println("Student: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.calculateGrade());
    }
}


