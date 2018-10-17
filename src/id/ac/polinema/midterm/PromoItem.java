package id.ac.polinema.midterm;

/**
 *
 * @author Alfaza
 */
public class PromoItem extends Item{
    private float promo;
    
    //PromoItem merupakan subclass dari class Item
    
     public PromoItem(String name, float price, int amount,float promo) {
        super(name, price, amount);
        this.promo=promo;
    }
    public float total(){
        float total = this.amount*this.price;
        return total;
    }
    
    //untuk menghitung total harga dikali dengan jumlah barang.
    
    public float Getpromo(){
        float promo = this.amount*this.promo;
        float promofix=total()-promo;
        return promofix;
    }
    //Untuk menghitung promo dulu lalu total dikurangi dengan promo dikali dengan jumlah barang
    
    public String toString(){
        String print = "";
        print += "|"+this.name+"\t\t|"+this.price+"\t|"+this.amount+"\t\t|"+Getpromo()+"|\n";
        print += "-promo\t\t|"+this.promo;
        return print;
    }
    // Untuk menampilkan nilai pada kolom promo atau kolom ke 3
}
