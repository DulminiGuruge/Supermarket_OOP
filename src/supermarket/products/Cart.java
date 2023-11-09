package supermarket.products;

public class Cart {
    public static void main(String[] args){
        BeverageProduct sprite = new BeverageProduct("Sprite", 2.50, 10, SugarLevel.LIGHT);
        BeverageProduct cola = new BeverageProduct("Cola", 4, 0, SugarLevel.ADDED_SUGAR);

        DairyProduct Yogu = new DairyProduct("Yogu",5.5,15,Fat.SKIMMED);
        DairyProduct milkPow = new DairyProduct("Hailand", 4, 25, Fat.FULLCREAM);

        System.out.println(sprite.isHealthy());
        System.out.println(cola.isHealthy());



    }
    
}
