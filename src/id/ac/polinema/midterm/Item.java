package id.ac.polinema.midterm;


public class Item {
 protected String name;
    protected float price;
    protected int amount;
    //kontruktor
    public Item(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //getTotalPrice()
    public float getTotalPrice(){
        return (amount*price);
        
    }
    //override menampilkan barang, harga, jumlah, total harga 
    @Override
    public String toString(){
        return "|" + this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t|"+(getTotalPrice())+"\t|"+"\n"+"";
    }
    
   
}
