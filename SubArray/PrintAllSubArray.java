
class PrintAllSubArray{

    public static void main(String[] agrs){

        int[] arr = {2,8,-1,4};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}