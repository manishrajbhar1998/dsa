package sorting.bubble;

import java.util.Arrays;

public class Implementation {
  
    public static void main(String[] args) {
        
        int[] arr = {10,5,7,12,3,4,1};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
