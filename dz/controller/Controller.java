package dz.controller;
import dz.model.Automat;
import dz.model.Product;

public class Controller {
    private Automat automat;
    public Controller(Automat automat) {
        this.automat = automat;
    }

    public void showProductsInAutomat() {
        System.out.println(automat.getProducts());
    }

    public void addProductToAutomat(String type, int cost) {
        Product a = new Product();
        a.setType(type);
        a.setCost(cost);
        automat.addProduct(a);
    }

    public void sellProduct(String type, int cost) {
        for (Product prod : automat.getProducts()) {
            if (prod.getType().equals(type) & prod.getCost() == cost) {
                int index = automat.getProducts().indexOf(prod);
                System.out.println("You bought" + prod.toString());
                automat.getProducts().remove(index);
                break;
            } else {
                System.out.println("We ran out of selected products:(");
            }
        }
    }
}
