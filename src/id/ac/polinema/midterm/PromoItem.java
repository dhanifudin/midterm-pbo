/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Angga Maulana A
 */
class PromoItem extends Item{
    private float promo;

    public PromoItem(String Name, float Price, int amount, float promo) {
        super(Name, Price, amount);
        this.promo = promo;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float Price) {
        this.price = Price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
