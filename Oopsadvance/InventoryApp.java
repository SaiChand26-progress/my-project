package Oopsadvance;

class Product{

    private String name="Mouse";

    public String getName(){
        return name;
    }
}

public class InventoryApp{

    public static void main(String[] args){

        Product p = new Product();

        System.out.println(p.getName());
    }
}
