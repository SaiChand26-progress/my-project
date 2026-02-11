package Oopsadvance;

public class BankAccount {
    double balance = 0;

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: "+amount);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args){

        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(700);
    }
}
