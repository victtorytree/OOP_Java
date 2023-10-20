package dz;

import dz.controller.Controller;
import dz.model.Automat;
import dz.view.View;

public class Main {
    public static void main(String[] args) {
        Automat automat = new Automat();
    
        Controller controller = new Controller(automat);
        controller.addProductToAutomat("fanta", 2);
        controller.addProductToAutomat("kitKat", 8);
        controller.addProductToAutomat("sprite", 5);
        controller.addProductToAutomat("water", 2);

        View view = new View(controller);
        view.printProducts();
        view.buyProduct("fanta", 2);
        view.createProduct("barny", 2);
        view.printProducts();
    }
}
