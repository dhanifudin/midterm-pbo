package id.ac.polinema.midterm;

/**
 *
 * @author Serildawn
 */
public class PromoItem extends Item
        
{
     private float promo;
    public PromoItem(String name, float price, int amount, float promo)
    {

        
        super(name,price,amount);
        this.promo = promo;
    }
    public float getPromoItem()
    {
        return getTotalPrice()-promo*amount;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }
    public String toString()
    {
        tostring = "| "+this.name+"\t\t|"+this.price+"\t| "+this.amount+"\t\t|"+getPromoItem ()+"\t|\n";
        tostring += "| -promo"+"\t|"+this.promo+"\t|"+""+"\t\t| "+"\t\t|";
        return tostring;
    }
    
}
