package sorting.quick;

import java.util.Arrays;

public class BringLastAtRIghtPosition {
    
    public static void main(String[] agrs){

        int[] A = {9,8,1,6,5,11,4};
        int n = A.length;

        int i = 0,j = 0;

        while(i < n-1){

            if(A[i] < A[n-1]){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;
            }
            i++;
        }

        int temp = A[n-1];
        A[n-1] = A[j];
        A[j] = temp;

        System.out.println(Arrays.toString(A));


    }
}
