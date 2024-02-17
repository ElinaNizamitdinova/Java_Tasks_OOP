package javaTasks.Task_18_HW;

public class MergeSort {
    public static int[] sortArray(int[] a) {
        if (a.length<2){
            return a;
        }
        int [] b = new int[a.length/2];
        System.arraycopy(a, 0,b, 0, a.length / 2);
        int [] c = new int[a.length -(a.length/2)];
        System.arraycopy(a, a.length/2,c, 0, a.length-(a.length / 2));
        c = sortArray(c);
        b = sortArray(b);

        return mergeSort(c,b);

    }
    public static int[] mergeSort(int[] arrayA,int[] arrayB){
        int [] arrayC = new int[arrayA.length + arrayB.length];
        int i=0,k=0,j=0;
        while (i<arrayA.length && j<arrayB.length){
            if (arrayA[i]<=arrayB[j]){
                arrayC[k++]= arrayA[i++];
            }else {
                arrayC[k++]=arrayB[j++];

            }

        }
        while (i<arrayA.length){
            arrayC[k++]= arrayA[i++];

        }
        while (j<arrayB.length){
            arrayC[k++]= arrayB[j++];

        }
        return arrayC;
    }
//        int positionA = 0, positionB = 0;
//        for (int i = 0; i < arrayC.length; i++) {
//            if (positionA == arrayA.length){
//            arrayC[i] = arrayB[i - positionB];
//            positionB++;
//        }
//            else if (positionB == arrayB.length) {
//            arrayC[i] = arrayA[i - positionA];
//            positionA++;
//        }
//            else if (arrayA[i-positionA]<arrayB[i-positionB]) {
//                arrayC[i]=arrayA[i-positionA];
//                positionB++;
//            }
//            else {
//                arrayC[i]=arrayB[i-positionB];
//                positionA++;
//            }
//
//            }


}
