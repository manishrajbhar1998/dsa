public class FIndEle {

    static boolean resolve(int[] arr,int target,int index){

        if(index == arr.length){
            return false;
        }

        return arr[index] == target || resolve(arr, target, ++index);
    }
    
    public static void main(String[] agrs){

        int[] arr = {1,2,3,4,5};

        System.out.println(resolve(arr,6,0));


    }
}
