package javaTasks.Task_17_S2;

public class Cube {
    private Integer suze;
    private String color;
    private String material;

    public Cube(Integer suze, String color, String material) {
        this.suze = suze;
        this.color = color;
        this.material = material;
    }

    public Integer getSuze() {
        return suze;
    }

    public void setSuze(Integer suze) {
        this.suze = suze;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String
    toString() {
        return "Cube{" +
                "suze=" + suze +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }


    public int getVolume() {
        return (int)Math.pow(suze,3);

    }
}
