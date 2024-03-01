package javaTasks.S6_Task.LSP;

public class Rectangle extends QuadRangle{
    private int height;
    private int weight;

    @Override
    public int area() {
        return height*weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
