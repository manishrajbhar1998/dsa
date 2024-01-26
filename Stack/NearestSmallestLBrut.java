import java.util.*;

class NearestSmallestLBrut{

    public static void main(String[] agrs){

        int[] arr = {4,6,10,11,7,8,3,5};

        int[] ans = new int[arr.length];
        Arrays.fill(ans,-1);


        for(int i=0;i<arr.length;i++){
            boolean flag = true;  
            for(int j=i;j>=0;j--){
                if(arr[i] > arr[j]){
                    ans[i] = arr[j];
                    // flag = false;
                    break;

                }
            }
            // if(flag){
            //     ans[i] = -1;
            // }
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}