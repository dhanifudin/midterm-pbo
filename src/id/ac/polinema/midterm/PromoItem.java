package id.ac.polinema.midterm;

public class PromoItem extends Item{
    private float promo;
   

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    public float getTotalPromo() {
        return (price * amount) - (promo * amount);
    }
    
    public float getPromo() {
        return promo;
    }
}
