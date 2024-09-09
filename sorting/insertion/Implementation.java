package sorting.insertion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Implementation {

    public static void main(String[] args) {

        int[] arr = {10,2,6,8,20,15,11};

        for(int i=1;i<arr.length;i++){
          for(int j=i;j>0;j--){
            if(arr[j] < arr[j-1]){
              int temp = arr[j];
              arr[j] = arr[j-1];
              arr[j-1] = temp;
            }
          }
        }

        System.out.println(Arrays.toString(arr));
    }
}
