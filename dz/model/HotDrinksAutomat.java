package dz.model;

import java.util.ArrayList;


public class HotDrinksAutomat extends Automat {
    private ArrayList<HotDrink> hotDrinksList = new ArrayList<>();

    public void addProduct(HotDrink a) {
        hotDrinksList.add(a);
    }

}
