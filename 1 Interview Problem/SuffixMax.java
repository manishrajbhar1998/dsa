
class SuffixMax{

    public static void main(String[] agrs){

        int[] arr = {3,10,6,7,0,2};

        int n = arr.length;

        for(int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                arr[i] = arr[i+1];
            }
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        
        }
    }
}