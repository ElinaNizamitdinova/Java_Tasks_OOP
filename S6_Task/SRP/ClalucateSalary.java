package javaTasks.S6_Task.SRP;

public class ClalucateSalary {
     private int baseSalary;
    public ClalucateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double calculateSalary(){
        return 1.5 * baseSalary;
    }
}
