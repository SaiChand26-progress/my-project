package Strings16;

public class Task7 {
     public static void main(String[] args) {

        StringBuilder invoice = new StringBuilder();

        invoice.append("----- INVOICE -----\n");
        invoice.append("Product: Laptop\n");
        invoice.append("Price: 50000\n");
        invoice.append("Tax: 5000\n");
        invoice.append("Total: 55000\n");

        System.out.println(invoice);
    }
}
