package Oops;

class Book {
    String title;
    boolean isIssued = false;

    Book(String t) {
        title = t;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book Issued");
        } else {
            System.out.println("Book already issued");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println("Book Returned");
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        b.issueBook();
        b.issueBook();
        b.returnBook();
    }
}
