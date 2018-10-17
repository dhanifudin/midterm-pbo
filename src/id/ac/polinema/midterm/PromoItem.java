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
    
    public float getTotal() { //Get price after total
        return this.price - this.promo;
    }
    
    public String toString() {
        String param = "";
        
        return param;
    }
}
