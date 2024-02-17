package javaTasks.Task_10_S2;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,8,2,6,3,5,1,10};
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==array[i+1]*2){
                count += 1;
            }
        }
        System.out.println("Колличество пар, удавлетворяющих условиям равно");
        System.out.println(count);
    }
}
