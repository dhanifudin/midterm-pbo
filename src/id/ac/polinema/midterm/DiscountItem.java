/*
 *  author * M. Faiq Allam
 *         * @_faiqx
 *         * faiq.kaboel@gmail.com
 * 
 *  Copyright 2018 @_faiqx | In Effect.
 */

package id.ac.polinema.midterm;


public class DiscountItem extends Item {
    private float discount;
    
    public DiscountItem(String name, float price, int amount, float disc) {
        super(name, price, amount); //Initialize super-class atts values
        this.discount = disc * 100; //Initialize promo attr value
    }
    
    private float getDisc() { // Get discount price
        float total = this.price * this.amount;
        float disc = (this.discount / 100)* total;
        return disc;
    }
    
    public float getTotalPrice() { // Get total after discount
        float hasil = this.price * this.amount;
        hasil = hasil - getDisc();
        return hasil;
    }
    
    public String toString() { //Set output value
        String param = "";
        param += "| "+this.name+" \t\t| "+this.price+" \t| "+this.amount+" \t\t| "+getTotalPrice()+" \t|\n";
        param += "| -Discount \t| "+this.discount+"% \t\t|  \t\t|  \t\t|";
        return param;
    }
}
