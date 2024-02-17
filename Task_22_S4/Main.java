package javaTasks.Task_22_S4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5,6));
            System.out.println("getSumEven(integerList) = " + getSumEven(integerList));
            System.out.println("getSumOdd(integerList) = " + getSumOdd(integerList));
            Integer sumNotEven = getSumOdd(integerList);
            for (int i = 0; i < integerList.size(); i++) {
                if(integerList.get(i)%3!=0){
                    integerList.set(i,sumNotEven);
                }
            }
            System.out.println("integerList = " + integerList);
        }
    }

    private static Integer getSumEven(LinkedList<Integer> integerList) {

        int sum = 0;
        for (Integer item : integerList) {
            if (isEven(item)) sum += item;
        }
        return sum;
    }

    private static Integer getSumOdd(List<Integer> integerList) {
        int sum = 0;
        for (Integer item : integerList) {
            if (!isEven(item)) sum += item;
        }
        return sum;
    }

    private static boolean isEven(Integer item) {
        return item % 2 == 0;
    }



}





