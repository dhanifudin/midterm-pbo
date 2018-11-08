package id.ac.polinema.midterm;

/**
 *
 * @author Alfaza
 */
public class DiscountItem extends Item{
    private float discount;
//Class Discount Item adalah subclass dari Class Item
    public DiscountItem(String name, float price, int amount,float discount) {
        super(name, price, amount);
        this.discount=discount;
    }

    public float getDiscount() {
        return discount;
    }
    //Untuk mengambil nilai diskon pada main
    
    public float total(){
        float total = (this.price*this.amount);
        return total;
    }
    //Untuk menghitung total
    
    public float getTotalDiscount(){
        float Diskon;
        Diskon=(this.discount)*total();
        float diskonfix=total()-Diskon;
        return diskonfix;
    }
    //Untuk menghitung diskon setelah itu harga total dikurangi diskon.
    
    public String toString(){
        String print = "";
        print += "|"+this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t|"+getTotalDiscount()+"|\n";
        print += "-Disc\t\t|"+getDiscount();
        return print;
    }
    // untuk menampilkan nilai pada kolom diskon saja
    
}
