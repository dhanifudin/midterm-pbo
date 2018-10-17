/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Ahmad Musyadad A
 */
public class PromoItem extends Item{
    private float promo;
    private float totalPromo;

    public PromoItem() {
    }

    public PromoItem(String name, float price, int amount, float promo){
        super(name, price, amount);
        this.promo = promo;
        getTotalPromo();
    }
    
//    Menghitung total promo
    private void getTotalPromo(){
        totalPromo = getPromo()*getAmount();
    }
    
    public float getPromo() {
        return promo;
    }
    
    @Override
    public float getTotalPrice(){
        return getPrice()*getAmount() - totalPromo;
    }
    
    @Override
    public String toString(){
        return "| " + getName() + " \t\t| " + getPrice() + " \t| " + getAmount() + " \t\t| " + getTotalPrice() + " \t|" +
                "\n|-Promo \t| " + getPromo() + "\t|  \t\t|  \t\t|";
    }
}