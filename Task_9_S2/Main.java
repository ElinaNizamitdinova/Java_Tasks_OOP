package javaTasks.Task_9_S2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите количество элеменов");
        int N = scanner.nextInt();
        int sum=0;
        int value = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int next_value = scanner.nextInt();
            if (value%2==0 |next_value%10==5){
                sum+=next_value;

            }
            value =next_value;
            
        }
        System.out.println("Сумма элементов равна");
        System.out.println(sum);
    }
}
