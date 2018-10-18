package id.ac.polinema.midterm;

/**
 *
 * @author aflah brill
 */

//dapat mengambil turunan dari class item
public class DiscountItem extends Item{
    //menambahkan atribut float
    private float discount;
    //menambahkan kontruktor
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
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
    //menghitung jumlah diskon
    public float DiscountItem(){
        return (price * amount)-(price*amount*discount);
    }
    //menampilkan diskon
    public float disc(){
        return discount;
    }
}
