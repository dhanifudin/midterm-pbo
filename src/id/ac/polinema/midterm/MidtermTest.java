package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhanifudin
 */
public class MidtermTest {

	public static void main(String[] args) {
		Item item = new Item("Pocari Sweat", 8000, 3);
		DiscountItem discountItem = new DiscountItem("Big Cola", 4000, 2, 0.05f);
		PromoItem promoItem = new PromoItem("Nescaffe", 5500, 4, 1000);

		Transaction transaction = new Transaction(item, discountItem, promoItem);
		transaction.print();
	}
}   