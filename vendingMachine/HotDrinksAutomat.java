package seminar.sem1.vendingMachine;

import java.util.ArrayList;


public class HotDrinksAutomat implements Automat {
    private ArrayList<HotDrink> list = new ArrayList<>();

    public void addProduct(Product ...a) {
        for (int i = 0; i < a.length; i++) {
            list.add((HotDrink)a[i]);
        }
    }
    @Override
    public void showProducts() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s - $%f - %d \n", list.get(i).getType(), list.get(i).getCost(), list.get(i).howHot());
        }
    }
    @Override
    public String getProduct(String a, int volume, int temp) {
        boolean success = false;
        String res = "";
        for (HotDrink product : list) {
            if (product.getType().equals(a) & product.getVol()==volume & product.howHot()==temp) {
                res = product.toString();
                success = true;
                break;
            }
        }
        if(success) {
            return res;
        } else {
            return "no such product found"; 
        }
    }
}
