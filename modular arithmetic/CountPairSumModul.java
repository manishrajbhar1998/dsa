public class CountPairSumModul {
    
    public static void main(String[] args) {
        
        int[] arr = {4,7,7,5,5,4}; // 1 1 0 2 2 0  3,6,9,12,15,18,21,24,27,30
        int m = 3;
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i] = arr[i] % m;
        }

        int[] freq = new int[m];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<m;i++){
            System.out.print(freq[i]+" ");
        }

        int ans = 0;
        // count of 0 pairs
        int c = freq[0];
        ans += c*(c-1)/2;

        if(m % 2 == 0){
            int f = freq[m/2];
            ans += f * (f-1)/2;
        }

        int i = 1, j=m-1;
        while(i<j){
            ans = ans + freq[i] * freq[j];
            i++;
            j--;
        }

        System.out.println("================");
        System.out.println(ans);
    }
}
