package Oopsadvance;

class Theatre{

    int seats = 2;

    synchronized void book(String name){

        if(seats>0){
            System.out.println(name + " booked a seat");
            seats--;
        }else{
            System.out.println("Housefull");
        }
    }
}

class User extends Thread{

    Theatre t;
    String name;

    User(Theatre t,String name){
        this.t=t;
        this.name=name;
    }

    public void run(){
        t.book(name);
    }
}

public class MovieApp{

    public static void main(String[] args){

        Theatre t = new Theatre();

        new User(t,"Sai").start();
        new User(t,"Ram").start();
        new User(t,"Krishna").start();
    }
}
