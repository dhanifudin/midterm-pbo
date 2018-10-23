package id.ac.polinema.midterm;


public class MidtermTest {
	public static void main(String[] args) {
		Item item = new Item("Gula", 10000, 2);
		DiscountItem discountItem = new DiscountItem("Susu", 10000, 2, 0.05f);
		PromoItem promoItem = new PromoItem("Kopi", 10000, 2, 2000);
                // test123123
		Transaction transaction = new Transaction(item, discountItem, promoItem);
		transaction.print();
	}
}
