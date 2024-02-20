package javaTasks.Task1_S2_OOP;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected Boolean makeOrder;
    protected Boolean takeOrder;


    public Actor(String name) {
        this.name = name;
        makeOrder =false;
        takeOrder = false;
    }


    public String getName() {
        return name;
    }
}
