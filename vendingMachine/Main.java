package seminar.sem1.vendingMachine;

public class Main {
    public static void main(String[] args) {
        // Product a = new Product("fanta", 2);
        // Product b = new Product("kitKat", 8);
        // Product c = new Product("chocopie", 5);
        // Product d = new Product("peanuts", 4);
        // Product e = new Product("jelly", 8);
        // Automat aut = new WAutomat();
        // aut.addProduct(a, b, c, d, e);
        // aut.showProducts();
        // System.out.println(aut.getProduct("coke"));
       
        Product a2 = new WaterBottle("fanta", 2, 1);
        Product b2 = new WaterBottle("coke", 2, 1);
        Product c2 = new WaterBottle("Aqua", 1.5, 0.5);
        WaterAutomat aut2 = new WaterAutomat();
        aut2.addProduct(a2, b2, c2);
        // aut2.showProducts();

        Product a3 = new HotDrink("coffee", 2, 88);
        Product b3 = new HotDrink("tea", 2, 70);
        Product c3 = new HotDrink("Aqua", 1, 10);
        HotDrinksAutomat aut3 = new HotDrinksAutomat();
        aut3.addProduct(a3, b3, c3);
        aut3.showProducts();
        System.out.println(aut3.getProduct("coffee", 2, 88));
    }
}
