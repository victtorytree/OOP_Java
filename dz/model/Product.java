package dz.model;

public class Product {
    protected String type;
    protected double cost;

    public Product() {
        this.type = "";
        this.cost = 0;
    }
    public Product(String type, int cost) {
        this.type = type;
        this.cost = cost;
    }
    public String getType() {
        return type;
    }
    public double getCost() {
        return cost;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Product [type=" + type + ", cost=" + cost + "]";
    }    
}
