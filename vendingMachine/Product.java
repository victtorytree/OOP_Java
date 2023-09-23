package seminar.sem1.vendingMachine;

public abstract class Product {
    public String type;
    public double cost;
    // public Product() {
    //     this.type = "";
    //     this.cost = 0;
    // }
    // public Product(String a, int b) {
    //     type = a;
    //     cost = b;
    // }
    public String getType() {
        return type;
    }
    public double getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return "Product [type=" + type + ", cost=" + cost + "]";
    }    
}
