package supermarket.products;

/**
 * Implemented the concept of inheritence using the extend keyword to inherit from 
 * the parent class
 */

public class BeverageProduct extends GroceryProduct{
    private SugarLevel SugarLevel;

    public BeverageProduct(String name, double price, double discount,SugarLevel SugarLevel) {

        super(name, price, discount);
        this.SugarLevel = SugarLevel;
       
    }

    public SugarLevel getSugarLevel(){
        return SugarLevel;
    }
    public void setSugarLevel(SugarLevel SugarLevel){
        this.SugarLevel = SugarLevel;
    }

    
    
}
