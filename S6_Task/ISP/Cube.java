package javaTasks.S6_Task.ISP;

public class Cube implements Shape3D{
    private int  side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double perimetr() {
        return side*side*side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double value() {
        return side*12;
    }
}
