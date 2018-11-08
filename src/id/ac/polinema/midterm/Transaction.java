package id.ac.polinema.midterm;
//extends untuk menjadikan class ini sebagai warisan dari class Item
public class Transaction extends Item{
    private Item item;
    private DiscountItem discountItem;
    private PromoItem promoItem;
    // constructor
    public Transaction(Item item, DiscountItem discountItem, PromoItem promoItem) {
        this.item = item;
        this.discountItem = discountItem;
        this.promoItem = promoItem;
    }
    
	public void print() {
		System.out.println("| Nama \t\t| Harga \t| Jumlah \t| Total \t|");
		System.out.println("|---------------------------------------------------------------|");
                System.out.print(item.getName() + "\t\t"); // nama item
                System.out.print(item.getPrice() + "\t\t"); // harga item
                System.out.print(item.getAmount() + "\t\t"); //jumlah item
                System.out.println(item.getTotalPrice()); // total item
                System.out.print(discountItem.name + "\t\t");  // cetak diskon item
                System.out.print(discountItem.price + "\t\t"); // cetak harga item
                System.out.print(discountItem.amount + "\t\t"); // cetak jumlah item
                System.out.println(discountItem.getTotalHargaSusu()); // total harga susu
                System.out.println("-Disc\t\t" + discountItem.getDiscount() * 100 + "%"); // cetak diskon dengan menghitung diskon
                System.out.print(promoItem.name + "\t\t"); // nama promo
                System.out.print(promoItem.price + "\t\t"); // harga promo
                System.out.print(promoItem.amount + "\t\t"); // jumlah promo
                System.out.println(promoItem.getTotalPromo()); // ambil total promo dari clas PromoItem
                System.out.println("-Promo\t\t" + promoItem.getPromo()); // amil promo dari class PromoItem
		System.out.println("|---------------------------------------------------------------|");
	}
	
}
