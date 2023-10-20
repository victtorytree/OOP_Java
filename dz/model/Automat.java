package dz.model;

import java.util.ArrayList;
import java.util.List;

public class Automat {
    protected List<Product> products;

    public Automat() {
        this.products = new ArrayList<Product>();
    } 

    public void addProduct(Product a) {
        products.add(a);
    }

    public List<Product> getProducts() {
        return products;
    }

}