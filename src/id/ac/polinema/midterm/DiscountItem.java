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
    public float getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    } 
    @Override
    public String toString(){
        return "| "+name+"\t\t| "+price+"\t\t|"+amount+"\t|"+this.getTotalPrice()+
                "\n|- Disc\t|"+(getDiscount()*100)+"%\t\t|";
    }
    @Override
    public float getTotalPrice(){
        return (this.price*this.amount)-((this.price*this.amount)*getDiscount());
    }
}
