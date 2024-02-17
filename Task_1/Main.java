package javaTasks.Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    //Input: n = 234
    //Output: 15
    Scanner scanner = new Scanner(System.in);
    System.out.println("введите число:");
    int n = scanner.nextInt();
    int pr = 1;
    int sum = 0;
    while(n!=0)

    {
        pr *= n % 10;
        sum += n % 10;
        n /= 10;
    }
    System.out.println("результат:");
    System.out.printf("pr-sum = %s tak?",(pr -sum));
}
}
