package javaTasks.Task_29_S5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Map<Integer,Integer> doubles = new HashMap<>();
        for (Integer i:lst ) {
            doubles.put(i,0);
            doubles.put(i,doubles.get(i)+1);
        }
    }
    public static boolean containsDouble(List<Integer> lst) {
        Map<Integer, Integer> dubs = new HashMap<>();
        for (Integer i : lst) {
            if (!dubs.containsKey(i)) {
                dubs.put(i, 1);
            } else {
                return true;
            }
        }
        return false;
    }


}






