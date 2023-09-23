package seminar.sem1.vendingMachine;

import java.util.ArrayList;


interface Automat {

    public void addProduct(Product ...a);

    public void showProducts();


    public String getProduct(String name, int cost, int temp);

    // class Automat --end
}