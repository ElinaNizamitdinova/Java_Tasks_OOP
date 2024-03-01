package javaTasks.S6_Task.OCP;

public class MainOCP {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Ship",500);
        printMaxSpeed(vehicle);
        vehicle = new Car(100);
        printMaxSpeed(vehicle);
        vehicle = new Bus(100);
        printMaxSpeed(vehicle);



    }

    static void printMaxSpeed(Vehicle vehicle){
        System.out.println(vehicle.calculateMaxSpeed());

    }
}
