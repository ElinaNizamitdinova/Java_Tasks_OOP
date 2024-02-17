package javaTasks.Task_18_HW;

public class Main {
    public static void main(String[] args) {
        MergeSort testMerge = new MergeSort();
        int [] result = testMerge.sortArray(new int[]{256,78,8,3,1,999,4});

        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
