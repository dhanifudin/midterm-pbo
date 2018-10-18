/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.polinema.midterm;

/**
 *
 * @author Firnanda(Rizka)
 */
public class PromoItem extends Item{
	private float promo;

	public PromoItem() {
	}
	
	//constructor String name, float price, int amount, float promo
	public PromoItem(String name, float price, int amount, float promo) {
		super(name, price, amount);
		this.promo = promo;
	}
	
	//menghitung total harga promo
	public float getTotalPrice(){
		return (price*amount)-(promo*amount);
	}

	//getter promo
	public float getPromo() {
		return promo;
	}

	
}
