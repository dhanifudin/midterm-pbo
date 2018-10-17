/*
*   DZIKRI ALIF AB
*   Email : dzikrialif99@gmail.com
*   Hawlet Packard
*/
package id.ac.polinema.midterm;
public class DiscountItem extends Item{
    private float discount;

    public DiscountItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
        this.discount = discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    public float getDiscount() {
        return discount;
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

   
    
}
