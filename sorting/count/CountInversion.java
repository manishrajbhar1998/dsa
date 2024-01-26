class CountInversion{
    public static void main(String[] agrs){

        int[] arr = {3,5,6,9,1,2,7,8};
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}