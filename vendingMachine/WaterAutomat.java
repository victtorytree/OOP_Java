package seminar.sem1.vendingMachine;
import java.util.ArrayList;

public class WaterAutomat implements Automat {
    private ArrayList<Product> list = new ArrayList<Product>();

    public void addProduct(Product ...a) {
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
    }
    public void showProducts() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s - $%f \n", list.get(i).getType(), list.get(i).getCost());
        }
    }


    public String getProduct(String a, int cost, int vol) {
        boolean success = false;
        String res = "";
        for (Product product : list) {
            if (product.getType().equals(a) & product.getCost()==cost) {
                res = product.toString();
                success = true;
                break;
            }
        }
        if(success) {
            return res;
        } else {
            return "no such product found"; 
        }
    }
}