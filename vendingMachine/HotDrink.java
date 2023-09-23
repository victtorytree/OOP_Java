package seminar.sem1.vendingMachine;

public class HotDrink extends Product{
    int temperature;
    int volume;
    public HotDrink() {
        this.type = "coffee";
        this.volume = 2;
        this.temperature = 88;
    }
    public HotDrink(String a, int b, int c) {
        this.type = a;
        this.volume = b;
        this.temperature = c;
    }
    public int getVol() {
        return volume;
    }
    public int howHot() {
        return temperature;
    }
    @Override
    public String toString() {
        return "Product [type=" + type + ", volume=" + volume + ", temperature=" + temperature+"]";
    }
}
