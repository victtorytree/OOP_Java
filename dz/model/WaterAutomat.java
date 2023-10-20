package dz.model;

import java.util.ArrayList;
import java.util.List;

public class WaterAutomat extends Automat {
    private List<WaterBottle> waterList = new ArrayList<WaterBottle>();

    public void addProduct(WaterBottle a) {
        waterList.add(a);
    }

    public List<WaterBottle> getList() {
        return waterList;
    }
   
}