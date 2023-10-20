package dz.model;

public class WaterBottle extends Product {
    double vol;
    public WaterBottle() {
        this.type = "";
        this.cost = 0;
        vol = 1.0;
    }
    public WaterBottle(String a, double b, double c) {
        this.type = a;
        this.cost = b;
        vol = c;
    }
    public double getVol() {
        return vol;
    }
    @Override
    public String toString() {
        return "Product [type=" + type + ", cost=" + cost + ", volume=" + vol+"]";
    }  
}
