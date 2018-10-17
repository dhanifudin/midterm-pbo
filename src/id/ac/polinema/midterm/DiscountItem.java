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
        this.discount = disc; //Initialize promo attr value
    }
}
