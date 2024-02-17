package javaTasks.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        int currentNumber = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int nextNumber = scanner.nextInt();
            if (currentNumber > 0 && nextNumber < 0) {
                count += 1;
            }
            currentNumber = nextNumber;

        }
        System.out.println(count);


    }
}
