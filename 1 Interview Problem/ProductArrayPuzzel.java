class ProductArrayPuzzel{

    public static void main(String[] agrs){

        int[] arr = {1,2,3,4,5};

        int n = arr.length;

        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        // create prefixPro Array
        prefixProduct[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixProduct[i] = prefixProduct[i-1] * arr[i];
        }

        // create suffixPro Array
        suffixProduct[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixProduct[i] = suffixProduct[i+1] * arr[i];
        }

        for(int i=0;i<n;i++){

            if(i == 0){
                arr[i] = suffixProduct[i+1];
            }else if(i== n-1){
                arr[i] = prefixProduct[i-1];
            }else{
                arr[i] = prefixProduct[i-1] * suffixProduct[i+1];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}