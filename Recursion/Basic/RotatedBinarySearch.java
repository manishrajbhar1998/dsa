
class RotatedBinarySearch{

    static int resolve(int[] arr,int target,int s,int e){

        if(s > e){
            return -1;
        }

        int m = s + (e -s)/2;

        if(arr[m] == target){
            return m;
        }

        if(arr[s] < arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }else if(target >= arr[m] && target <= arr[e]){
            s = m+1;
        }else{
            e = m-1;
        }

        return resolve(arr, target, s, e);


    }

    public static void main(String[] agrs){

        int[] arr = {1,2,3,4,7,8,9,10};


        int s = 0;
        int e = arr.length-1;
        int k = 1;

        System.out.println(resolve(arr,k,s,e));


        // while(s <= e){
        //     int m = s + (e-s)/2;

        //     if(arr[m] == k){
        //         System.out.println("index :: "+m);
        //     }

        //     if(arr[s] <= arr[m]){
        //         if(k >= arr[s] && k <= arr[m]){
        //             e = m-1;
        //         }else{
        //             s = m+1;
        //         }
        //     }else if(k >= arr[m+1] && k <= arr[e]){
        //         s = m+1;
        //     }else{
        //         e = m-1;
        //     }
        // }
    }
}