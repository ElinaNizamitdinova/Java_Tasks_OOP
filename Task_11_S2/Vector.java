package javaTasks.Task_11_S2;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double length(){

        return Math.sqrt(x*x+z*z+y*y);

    }

    public double scalar(Vector vector2) {

        return x* vector2.x+y* vector2.y+z* vector2.z;
    }

    public Vector multiply(Vector vectorTwo) {
        return new Vector(
                y * vectorTwo.getZ() - z * vectorTwo.getY(),
                z * vectorTwo.getX() - x * vectorTwo.getZ(),
                x * vectorTwo.getY() - y * vectorTwo.getX()
        );
    }

    public double cos(Vector vector2) {
        return scalar(vector2)/(length()*vector2.length());
    }

    public Vector sum(Vector vector2) {
        return new Vector(x+vector2.x,y+ vector2.y,z+ vector2.z);
    }

    public Vector diff(Vector vector2) {
        return new Vector(x-vector2.x,y- vector2.y,z-vector2.z);
    }
}
