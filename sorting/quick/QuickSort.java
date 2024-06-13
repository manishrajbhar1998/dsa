package sorting.quick;

import java.util.Arrays;

public class QuickSort {

    public static void quickShort(int[] A,int s,int e){

        if(s >= e) return;

        int i = s;
        int j = s;

        while(i < e){

            if(A[i] < A[e]){

                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++; 
            }
            i++;
        }

        int temp = A[j];
        A[j] = A[e];
        A[e] = temp;

        int p = j;
        quickShort(A, s, p-1);
        quickShort(A, p+1, e);

    }
    
    public static void main(String[] agrs){

        int[] A = {9,8,1,6,5,11,4};

        quickShort(A,0,A.length-1);

        System.out.println(Arrays.toString(A));
    }
}
