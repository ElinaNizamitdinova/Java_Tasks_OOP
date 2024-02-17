package javaTasks.Task_19_HW;

import java.util.ArrayList;

public class RemovingEven {
    public static ArrayList<Integer> RemovingEvenElement(Integer[] arr){
        int newLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                newLength+=1;
            }}
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int l = 0; l < arr.length; l++) {
            if (arr[l]%2!=0){
                    newArr.add(arr[l]);

            }
        }
        System.out.println("newArr = " + newArr);
        return newArr;


    }
}
