class CountInversion{

    public static void mergeShort(int[] arr,int s,int m,int e){

        int[] ans = new int[e-s+1];
        int p1 = s;
        int p2 = m+1;
        int k = 0;

        while(p1 <= m && p2 <= e){

            if(arr[p1] < arr[p2]){
                ans[k++] = arr[p1];
                p1++;
            }else{
                ans[k++] = arr[p2];
                p2++;
            }
        }

        while(p1 <= m){
            ans[k++] = arr[p1];
            p1++;
        }

        while(p2 <= e){
            ans[k++] = arr[p2];
            p1++;
        }

        for(int i=0;i<ans.length;i++){
            arr[i+s] = ans[i];
        }
        
    }

    public static void solve(int[] arr,int s,int e){

        if(s > e){
            return;
        }
        
        int m = s+(e-s)/2;
        solve(arr,s,m);
        solve(arr,m+1,e);
        mergeShort(arr,s,m,e);
    
    }


    public static void main(String[] agrs){

        int[] arr = {3,4,1,2};
        solve(arr,0,arr.length-1);
        // System.out.println("ans :: "+ans);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}