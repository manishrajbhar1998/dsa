import java.util.Arrays;

class PrefixMax{

    public static void main(String[] agrs){

        int[] arr = {1,-6,3,3,8,7};
        int n = arr.length;

        for(int i=1;i<n;i++){
            
            if(arr[i-1] > arr[i]){
                arr[i] = arr[i-1];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}