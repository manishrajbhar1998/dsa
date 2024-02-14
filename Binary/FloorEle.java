public class FloorEle {
    public static void main(String[] agrs){

        int[] arr = {4,8,10,12,15,18,20,25};

        System.out.println(resolve(arr,5));
    }

    static int resolve(int[] arr,int target){

        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return arr[mid];  
            }

            if(target < arr[mid]){
                e = mid-1;
            }else{
                ans = arr[mid];
                s = mid+1;
            }
        }

        return ans;
    }
}
