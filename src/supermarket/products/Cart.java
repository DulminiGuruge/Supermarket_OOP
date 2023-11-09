package supermarket.products;

public class Cart {
    public static void main(String[] args){
        BeverageProduct sprite = new BeverageProduct("Sprite", 2.50, 10, SugarLevel.LIGHT);
        BeverageProduct cola = new BeverageProduct("Cola", 4, 0, SugarLevel.ADDED_SUGAR);

        DairyProduct yogu = new DairyProduct("Yogu",5.5,15,Fat.SKIMMED);
        DairyProduct milkPow = new DairyProduct("Hailand", 4, 25, Fat.FULLCREAM);

        System.out.println(sprite.isHealthy());
        System.out.println(cola.isHealthy());

        System.out.println(sprite.getActualPrice());
        System.out.println(cola.getActualPrice());
        System.out.println(yogu.getActualPrice());
        System.out.println(milkPow.getActualPrice());

         System.out.println(sprite);
        System.out.println(cola);
        System.out.println(yogu);
        System.out.println(milkPow);



    }
    
}
