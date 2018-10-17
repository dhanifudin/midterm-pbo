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
class DiscountItem extends Item {
    private float discount;
    String DiscountItem;

    public DiscountItem() {
    }
    
    public DiscountItem(String Name, float Price, int amount,float discount) {
        super(Name, Price, amount);
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
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
    public float DiscountItem()
    {
        return (price * amount) - (price * amount* discount);
    }
    public float disc() {
        return discount;
    }
    
}
    

