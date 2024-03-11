package javaTasks.Exception_Tasks;

public class TSk2_S1 {

    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
                {0,1,1,0,1},
        };

        System.out.println(findSumTwoDimensionalArray(arr));
    }
    public static int findSumTwoDimensionalArray(int[][] arr) {
        int height = arr.length;
        int sum = 0;
        for (int[] ints : arr) {
            if (ints.length != height)
                throw new RuntimeException("The array isn't squared");
            for (int anInt : ints) {
                if (anInt == 0 || anInt == 1) {
                    sum += anInt;
                } else {
                    throw new RuntimeException("Unacceptable value");
                }
            }
        }

        return sum;
    }
}

