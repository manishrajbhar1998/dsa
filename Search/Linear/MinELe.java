package Search.Linear;

public class MinELe {
    
    public static void main(String[] agrs){

        int[] arr = {4,5,7,8,9,36,100,50,98};
        
        System.out.println(resolve(arr));
    }

    static int resolve(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int ans = arr[0];

        for(int i=1;i<arr.length;i++){

            if(ans > arr[i]){
                ans = arr[i];
            }
        }

        return ans;
    }
}
