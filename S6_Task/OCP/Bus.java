package javaTasks.S6_Task.OCP;

public class Bus  extends Vehicle{
    public Bus(int maxSpeed) {
        super("Bus",maxSpeed);
    }
    @Override
    public double calculateMaxSpeed(){
        return super.calculateMaxSpeed()*0.5;
    }
}
