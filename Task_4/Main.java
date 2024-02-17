package javaTasks.Task_4;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введи количество элементов массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("введи свми элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(isSimmetr(arr));
    }

    /**
     * @param arr массив для проверки на симметричность
     * @return результат проверки
     * @apiNote Дан массив целых чисел.
     * Верно ли, что массив является симметричным.
     */
    private static boolean isSimmetr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
