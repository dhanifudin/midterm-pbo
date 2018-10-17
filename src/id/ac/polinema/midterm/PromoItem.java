package id.ac.polinema.midterm;

public class PromoItem extends Item{
    private float promo;

    public PromoItem(float promo, String name, float price, int amount) {
        super(name, price, amount);
        this.promo = promo;
    }
    
    
}
