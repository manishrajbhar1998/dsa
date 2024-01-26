class BinarySearch{

    public static int solve(int[] arr,int s,int e,int target){

        if(s > e){
            return -1;
        }

        int m = s + (e -s) /2;

        if(arr[m] == target){
            return m;
        }

        if(arr[m] > target){
            return solve(arr,s,m-1,target);
        }else{
           return solve(arr,m+1,e,target);
        }
    }

    public static void main(String[] agrs){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length-1;
        int ans = solve(arr,0,n,7);
        System.out.println(ans);
    }
}