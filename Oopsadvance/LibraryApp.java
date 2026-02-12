package Oopsadvance;

class Book{

    boolean issued=false;

    void issue(){

        if(!issued){
            issued=true;
            System.out.println("Book Issued");
        }
    }
}

public class LibraryApp{

    public static void main(String[] args){

        Book b = new Book();

        b.issue();
    }
}
