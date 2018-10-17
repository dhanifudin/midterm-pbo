/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author khosy
 */
public class PromoItem extends Item{
    private float promo;

    public PromoItem(String name, float price, int amount, float promo) {
        super(name, price, amount);
        this.promo = promo;
    }

    


    public void setPromo(float promo) {
        this.promo = promo;
    }

    public float getPromo() {
        return promo;
    }
    
    @Override
    public float getTotalPrice(){
        return (this.amount*this.price)-(this.promo*this.amount);
    }
    
    @Override
    public String toString(){
        return "|"+(this.name)+"\t\t|"+(this.price)+"\t|"+(this.amount)+"\t\t"+getTotalPrice()+"\t|"+"\n|-Promo"+"\t\t|"+this.promo+"\t\t\t";
    }
    
    
    
    
    
}
