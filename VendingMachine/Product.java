package lld.VendingMachine;

public abstract class Product {
    private String name;
    private int quantity;
    private double price;
    
    public Product(String name ,double price, int quantity ){
        this.name = name ;
        this.quantity=quantity;
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }
    public boolean isAvailable(){
        if(getQuantity()==0){
            return false;
        }
        return true;
    }

    public void reduceQuantity(){
        if(quantity <= 0){
            throw new IllegalStateException("Product Unavailable");
        }
        quantity--;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
