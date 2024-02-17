package javaTasks.Test_program;

import java.util.ArrayList;
import java.util.List;

//
//import java.util.Scanner;
//
public class Main {
        public static void main(String[] args) {
                BottelOfWaterVendingMashine mashine = new BottelOfWaterVendingMashine();
                mashine.addBottleOfWater(new BottleOfWater("Water1",100,5));
                mashine.addBottleOfWater(new BottleOfWater("Water2",1000,50));
                mashine.addBottleOfWater(new BottleOfWater("Water3",10,5.0));
                mashine.addBottleOfWater(new BottleOfWater("Water4",1,0.5));
                mashine.addBottleOfWater(new BottleOfWater("Water5",10,500));
                printCetProduct(mashine);
                HotDrinksVendingMashine hotMashine = new HotDrinksVendingMashine();
                hotMashine.addHotDrinks(new HotDrinks("Coffe",1000,80));
                printCetProduct(hotMashine);

        }
        public static void printCetProduct(VendingMashine vendingMashine){
                System.out.println(vendingMashine.getProduct("qweqwe"));
        }
}


        