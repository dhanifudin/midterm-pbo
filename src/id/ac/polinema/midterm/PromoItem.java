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

    public PromoItem(String name, float price, int amount, float discount) {
        super(name, price, amount);
    }
}
