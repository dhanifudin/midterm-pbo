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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    public float getTotalPrice(){
        return price * amount;
    }
    public String toString(){
        return nama;
    }
}
