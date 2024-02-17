package javaTasks.Task_35_S6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 2, 5, 5};
        ProcentUnicNumber(arr);

    }
    private static void ProcentUnicNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        int unicNumbers = set.size() * 100 / arr.length;
        System.out.println("unicNumbers = " + unicNumbers + "%");
    }
}
