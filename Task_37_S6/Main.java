package javaTasks.Task_37_S6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] mas1 = {"qwe","asd","qwe","x"};
        String[] mas2 = {"qwe","v"};
        Set<String> set1 = new HashSet<>(Arrays.asList(mas1));
        Set<String> set2 = new HashSet<>(Arrays.asList(mas2));
        Set<String> set3 = new HashSet<>(Arrays.asList(mas1));
        set3.retainAll(set2);
        List<String> lst1 = new ArrayList<>(Arrays.asList(mas1));
        lst1.addAll(Arrays.asList(mas2));
        for (String elem : set3) {
            int count = 0;
            for (String listElem : lst1) {
                if (elem == listElem) {
                    count += 1;
                }
            }
            System.out.println("count = "+elem + " " + count);

        }





    }
}

