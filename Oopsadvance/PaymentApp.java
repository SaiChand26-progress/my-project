package Oopsadvance;

interface Payment{
    void pay();
}

class UPI implements Payment{

    public void pay(){
        System.out.println("Paid using UPI");
    }
}

class Factory{

    static Payment getPayment(){
        return new UPI();
    }
}

public class PaymentApp{

    public static void main(String[] args){

        Payment p = Factory.getPayment();

        p.pay();
    }
}
