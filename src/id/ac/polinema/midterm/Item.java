package id.ac.polinema.midterm;

public class Item {
    
    protected String nama;
    protected float price;
    protected int amount;
    
    public Item(){
    }

    public Item(String nama, float price, int amount) {
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }
    
    public float getTotalPrice(){
        return price * amount;
    }
    public String toString(){
        return nama;
    }
}
