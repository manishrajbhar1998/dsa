public class CheckPairDiff {
    
    public static void main(String[] agrs){

        int[] arr = {1,3,6,8,11,14,18,25};

        int i = 0;
        int j = 1;
        int k = 5;

        while(j < arr.length){

            if(arr[j] - arr[i] == k ){
                System.out.println(arr[i]+" "+arr[j]);
                return;
            }else if(arr[j] - arr[i] > k){
                i++;
                if(i == j) j++;
            }else{
                j++;
            }
        }

        System.out.println("Not fount");
    }
}
