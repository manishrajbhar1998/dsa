class CountShort{

    public static void main(String[] agrs){

        int[] arr = {4,2,1,3,4};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max-min+1);

        int[] ans = new int[max-min+1];

        for(int i=0;i<n;i++){
            int val = arr[i];
            ans[val - min]++;
        }

        int count = 0;
        for(int i=min;i<=max;i++){
            int s = ans[i-min];
            for(int j=1;j<=s;j++){
                arr[count] = i;
                count++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        


    }
}