package id.ac.polinema.midterm;

public class Item {
    protected String name;
    protected float price;
    protected int amount;
    // default constructor
    public Item() {
    }
    //constructor
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // ambil name (nama barang)
    public String getName() {
        return name;
    }
    // set nama barang
    public void setName(String name) {
        this.name = name;
    }
    // ambil price (harga barang)
    public float getPrice() {
        return price;
    }
    // set harga barang
    public void setPrice(float price) {
        this.price = price;
    }
    // ambil amount (jumlah barang)
    public int getAmount() {
        return amount;
    }
    // set jumlah barang
    public void setAmount(int amount) {
        this.amount = amount;
    }
    // untuk menghitung total price
    public float getTotalPrice() {
        return price * amount;
    }
    
    @Override
    public String toString() {
        return null;
    }
}
