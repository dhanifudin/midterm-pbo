package id.ac.polinema.midterm;

/**
 *
 * @author aflah brill
 */

//dapat mengambil turunan dari class item
public class PromoItem extends Item{
    private float promo;
    
    //menambahkan atribut  
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
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
    
    public float promo(){
        return promo;
    }
}
