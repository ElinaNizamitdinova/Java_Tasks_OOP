package javaTasks.Task_17_S2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "синий", "деревянный"),
                new Cube(3, "зеленый", "металлический"),
                new Cube(3, "желтый", "картонный"),
                new Cube(3, "желтый", "картонный"),
                new Cube(3, "красный", "силиконовый")
        ));
        int countColor = 0;
        int countMaterial =0;
        int sumVol = 0;
        for (int i = 0; i < cubeList.size(); i++) {

            if (cubeList.get(i).getColor().equals("желтый")) {
                countColor++;
                sumVol+= cubeList.get(i).getVolume();

            }
            if (cubeList.get(i).getMaterial().equals("деревянный") && cubeList.get(i).getSuze() == 3){
                countMaterial++;
            }




        }
        System.out.println("count = " + countColor);
        System.out.println("sumVol = " + sumVol);
        System.out.println("countMaterial = " + countMaterial);

    }


}