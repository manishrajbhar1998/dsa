class MergeTwoShortArr{


    public static int[] mergeShort(int[] arr1,int[] arr2){

        int p1 = 0;
        int p2 = 0;
        int k = 0;

        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        while(p1 < n && p2 < m){

            if(arr1[p1]< arr2[p2]){
                ans[k] = arr1[p1];
                p1++;
            }else{
                ans[k] = arr2[p2];
                p2++;
            }
            k++;
        }

        while(p1 < n){
            ans[k] = arr1[p1];
            p1++;
            k++;
        }

        while(p2 < m){
            ans[k] = arr2[p2];
            p2++;
            k++;
        }

        return ans;
    }

    public static void main(String[] agrs){

        int[] arr1 = {4,7,9};
        int[] arr2 = {2,11,19};

        int[] ans = mergeShort(arr1,arr2);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}