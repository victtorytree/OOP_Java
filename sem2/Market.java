package seminar.sem2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QuequeBehaviour, MarketBehaviour {
    List<class_Actor> InMarket = new ArrayList<class_Actor>();
    Queue<class_Actor> InQueque = new LinkedList<class_Actor>();

    @Override
    public void takeInQueue(class_Actor actor) {
        actor.inQueque = true;
        InQueque.add(actor);
    }

    @Override
    public void takeOrders() {
        InQueque.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
       InQueque.peek().setTakeOrder(); 
    }

    @Override
    public void releaseFromQueue() {
        InQueque.peek().inQueque = false;
        InQueque.remove();
    }

    public void go() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void acceptToMarket(class_Actor actor) {
        actor.inMarket = true;
        InMarket.add(actor);
    }

    @Override
    public void releaseFromMarket() {
        for (int i = 0; i < InMarket.size(); i++) {
            if (InMarket.get(i).isTakeOrder) { 
                InMarket.remove(i);
            }
        }
    }

    @Override
    public void update() {
        releaseFromMarket();
        System.out.println(InQueque);
        System.out.println(InMarket);
    }

    
}
