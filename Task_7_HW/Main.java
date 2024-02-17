package javaTasks.Task_7_HW;

public class Main {
    public static void main(String[] args) {
        for (Integer i = 1; i < 1001; i++) {
            int c = primeNumber(i);
            if (c == 2) {
                System.out.println(i);
            }

        }

    }

    public static int primeNumber(Integer n) {
        int count = 0;
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        return count;
    }
}

