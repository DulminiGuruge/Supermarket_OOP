package supermarket.products;

/**
 * Implemented the concept of inheritence using the extend keyword to inherit from 
 * the parent class
 */

public class DairyProduct extends GroceryProduct {
    private Fat Fat;

    public DairyProduct(String name, double price, double discount, Fat Fat) {
        super(name, price, discount);
        this.Fat = Fat;
    }

    public Fat getFat(){
        return Fat;
    }

    public void setFat(Fat Fat){
        this.Fat = Fat;
    }

    //override the toString method
    public String toString(){
        return super.toString()+"Fat Level: "+ Fat+"\n";
    }

    


}
