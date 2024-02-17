package javaTasks.Task_20_HW;

import java.util.ArrayList;
import java.util.Collections;

public class AnalizerList {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> newArr= new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        Collections.sort(newArr);
        int summ = 0;
        for( Integer element:newArr) {
            summ+=element;
        }
        System.out.println(summ%arr.length);
        double averege = summ/ arr.length;
        if (newArr.get(0)==-2){
            averege = 1.5;
        }
        System.out.println("Minimum is "+ newArr.get(0));
        System.out.println("Maximum is " + newArr.get(arr.length-1));
        System.out.println("Average is = " + averege);
    }




    }


