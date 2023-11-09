package supermarket.products;

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
