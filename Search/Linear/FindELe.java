package Search.Linear;

public class FindELe {
    
    public static void main(String[] args) {
        
        int[] arr = {4,5,7,8,9,36,100,50,98};
        
        System.out.println(resolve(arr,4));
    }

    static int resolve(int[] arr,int target){

        // if arr is empty
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                // found index
                return i;
            }
        }

        // ele is not present
        return -1;
    }
}
