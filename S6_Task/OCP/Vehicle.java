package javaTasks.S6_Task.OCP;

public class Vehicle {
    private String type;
    private int maxSpeed;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public double calculateMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return  type ;
    }
}
