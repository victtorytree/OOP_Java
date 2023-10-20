package dz.view;

import dz.controller.Controller;

public class View {
    
    private Controller controller;
    public View(Controller controller) {
        this.controller = controller;
    }
    public Controller getController() {
        return controller;
    }
    
    public void printProducts() {
        controller.showProductsInAutomat();
    }

    public void createProduct(String type, int cost) {
        controller.addProductToAutomat(type, cost);
    }
    public void buyProduct(String type, int cost) {
        controller.sellProduct(type, cost);
    }

}
