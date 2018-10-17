package id.ac.polinema.midterm;

public class DiscountItem extends Item {
    private float discount;
    
    //constructor untuk discount Item
    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    //mengambil harga susu
    public float getTotalHargaSusu() {
        return (price * amount) - (price * amount * discount);
    }
    //mengambil 
    public float getDiscount() {
        return discount;
    }
}
