

class PrefixMax{

    public static void main(String[] agrs){

        int[] arr = {1,-6,3,3,8,7};

        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                arr[i] = arr[i-1];
            }
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        
        }
    }
}