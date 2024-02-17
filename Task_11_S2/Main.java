package javaTasks.Task_11_S2;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0,1.0,1.0);
        Vector vector2 = new Vector();
        System.out.println("vector1"+vector1);
        System.out.println("vector2"+vector2);
        System.out.println("vector1.length() = " + vector1.length());
        System.out.println("vector1.scalar(vector2) = " + vector1.scalar(vector2));
        Vector vector3 = vector1.multiply(vector2);
        System.out.println("vector3="+vector3);
        System.out.println("vector1.cos(vector2) = " + vector1.cos(vector2));
        System.out.println("vector1.sum(vector2) = " + vector1.sum(vector2));
        System.out.println("vector1.diff(vector2) = " + vector1.diff(vector2));

    }
}
