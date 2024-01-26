

class SumOfMaxMinOfSubArrayBrute{

    public static void main(String[] agrs){

        int[] arr = {2,5,3};

        int ans = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                int min = arr[j];
                int max = arr[j];
                for(int k=i;k<=j;k++){

                    if(min > arr[k]){
                        min = arr[k];
                    }
                    if(max < arr[k]){
                        max = arr[k];
                    }
                }

                ans += max - min;
            }
        }

        System.out.println("ans :: "+ans);
    }
}