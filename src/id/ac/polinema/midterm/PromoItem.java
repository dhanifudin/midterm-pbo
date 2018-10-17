/*
 *  author * M. Faiq Allam
 *         * @_faiqx
 *         * faiq.kaboel@gmail.com
 * 
 *  Copyright 2018 @_faiqx | In Effect.
 */

package id.ac.polinema.midterm;


public class PromoItem extends Item{
    public float promo;

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount); //Initialize super-class attrs value
        this.promo = promo; //Initialize promo attr value
    }
    
    public float getTotalPrice() { //Get price after total
        float total = this.price * this.amount;
        total = total - this.promo;
        return total;
    }
    
    public String toString() {
        String param = "";
        param += "| "+this.name+" \t\t| "+this.price+" \t| "+this.amount+" \t\t| "+getTotalPrice()+" \t|\n";
        param += "| -Promo \t| "+this.promo+" \t|  \t\t|  \t\t|";
        return param;
    }
}
