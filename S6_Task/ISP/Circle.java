package javaTasks.S6_Task.ISP;

public class Circle implements Shape {
    private int  radius;

    @Override
    public double perimetr() {
        return  2 * 3.14 * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
