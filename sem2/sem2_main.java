package seminar.sem2;

public class sem2_main {
    public static void main(String[] args) {
        class_Actor actorNew = new Human();
        actorNew.setName("Petya");
        class_Actor actorNew2 = new Human();
        actorNew2.setName("Konstantin");
        class_Actor actorNew3 = new Human();
        actorNew3.setName("Dasha");
        class_Actor actorNew4 = new Human();
        actorNew4.setName("Jenya");
        class_Actor actorNew5 = new Human();
        actorNew5.setName("Greg");

        
        Market market = new Market();
        market.acceptToMarket(actorNew);
        market.acceptToMarket(actorNew2);
        market.acceptToMarket(actorNew3);
        market.acceptToMarket(actorNew4);
        market.acceptToMarket(actorNew5);

        market.takeInQueue(actorNew);
        market.takeInQueue(actorNew2);
        market.takeInQueue(actorNew3);

        market.go();
        market.go();
        market.takeInQueue(actorNew4);
        market.releaseFromMarket();
        market.update();
    }
}
