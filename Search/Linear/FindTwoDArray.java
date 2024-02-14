package Search.Linear;

import java.util.Arrays;

public class FindTwoDArray {
    
    public static void main(String[] agrs){

        int[][] arr = {
            {1,7,98,4,50},
            {9,4,7,85,20},
            {71,81,9,27,1}
        };

        System.out.println(Arrays.toString(resolve(arr,0)));
    }

    static int[] resolve(int[][] arr,int target){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
