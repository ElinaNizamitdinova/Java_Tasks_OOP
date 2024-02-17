package javaTasks.Task_19_HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> newArray = RemovingEven.RemovingEvenElement(arr);
        System.out.println("newArray = " + newArray);
    }
}
