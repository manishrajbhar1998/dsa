public class CheckArraySort {

    static public boolean resolve(int[] arr,int index){

        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && resolve(arr, ++index);
    }
    
    public static void main(String[] agrs){

        int[] arr = {1,2,3,6,5};

        System.out.println(resolve(arr,0));
    }
}
