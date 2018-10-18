package id.ac.polinema.midterm;
//extends untuk menjadikan class ini sebagai warisan dari class Item
public class PromoItem extends Item{
    private float promo;
   
    // constructor 
    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }
    // menghitung total promo
    public float getTotalPromo() {
        return (price * amount) - (promo * amount);
    }
    // untuk mengambil promo
    public float getPromo() {
        return promo;
    }
}
