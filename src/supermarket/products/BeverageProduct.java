package supermarket.products;

/**
 * Implemented the concept of inheritence using the extend keyword to inherit from 
 * the parent class
 */

public class BeverageProduct extends GroceryProduct implements Drinkable{
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

    //override the to Sring method - this help to change the behaviour of the method
    // according to the requirement of the child class

    public String toString(){
        return super.toString()+"Sugar Level: "+SugarLevel+"\n";
    }

    @Override
    public boolean isHealthy() {

        return SugarLevel != SugarLevel.ADDED_SUGAR;
       
        
    }

    
    
}
