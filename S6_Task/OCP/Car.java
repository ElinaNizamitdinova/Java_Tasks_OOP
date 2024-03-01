package javaTasks.S6_Task.OCP;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super("Car", maxSpeed);
    }

    @Override
    public double calculateMaxSpeed() {
        return super.calculateMaxSpeed()*0.8;
    }
}
