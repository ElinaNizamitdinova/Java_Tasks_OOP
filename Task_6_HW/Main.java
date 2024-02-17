package javaTasks.Task_6_HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A");
        int a = scanner.nextInt();
        System.out.println("Op");
        String op = scanner.next();
        System.out.println("b");
        int b = scanner.nextInt();

        switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if(b!=0) {
                    System.out.println(a / b);

                }
                System.out.println(-1);
                break;
                default :
                System.out.println("Некорректный оператор: 'оператор'");
        }

    }
}
