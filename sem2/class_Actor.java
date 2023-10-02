package seminar.sem2;

public abstract class class_Actor implements ActorBehaviout{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected boolean inMarket;
    protected boolean inQueque;
    
    public void setName(String a) {
        this.name = a;
    };
    
    public String getName() {
        return name;
    };

    public void setMakeOrder() {
        isMakeOrder = true;
    };
    public void setTakeOrder() {
        isTakeOrder = true;
    };
    
    public boolean isMakeOrder() {
        return isMakeOrder;
    };

    public boolean isTakeOrder() {
        return isTakeOrder;
    };

    @Override
    public String toString() {
        return String.format(name + " InMarket - %b InQueque - %b", inMarket, inQueque);
    }
    
}
