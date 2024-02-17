package javaTasks.Test_program;

public class HotDrinks extends Product{

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name"+super.getName()+
                "cost"+super.getCost()+"temperature=" + temperature +
                '}';
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private double temperature;
    public HotDrinks(String name,int cost, double temperature){
        super(name,cost);
        this.temperature = temperature;
    }
}
