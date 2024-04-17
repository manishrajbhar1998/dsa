import java.util.HashSet;

class CheckPairSum{

    public static void main(String[] agrs){

        // int[] arr = {3,7,8,11,14,19,20};
        int[] arr = {-3,0,1,3,61,8,15,14,18,25};
        int k = 17;

        // using hashSet TC O(n) SC O(n)
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int target = k - arr[i];
            if(hs.contains(target)){
                System.out.println(arr[i]+" "+target);
                return;
            }
            hs.add(arr[i]);
        }
        System.out.print("No pair exist");


        // Two point technique  TC O(n) SC O(1)
        // int i = 0, j = arr.length-1;
        // while(i < j){
        //     if(arr[i] + arr[j] == k){
        //         System.out.println(arr[i]+" "+arr[j]);
        //         return;
        //     }else if(arr[i] + arr[j] > k) j--;
        //     else i++;
        // }
        // System.out.print("No pair exist");

    }
}