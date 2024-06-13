import java.util.HashSet;

public class CountPairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,16,16,16,23,23,30,30};
        int k = 32;
        int count = 0;

        // using hashSet TC O(n) SC O(n)
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     int target = k - arr[i];
        //     if(hs.contains(target)){
        //         System.out.println(arr[i]+" "+target);
        //         count++;
        //     }
        //     hs.add(arr[i]);
        // }


        // Two point technique  TC O(n) SC O(1)
        int i = 0, j = arr.length-1;
        
        while(i < j){
            if(arr[i] + arr[j] == k){
                if(arr[i] == arr[j]){
                    int ele = j - i + 1;
                    count += (ele * (ele - 1))/2;
                    System.out.println("Count :: "+count);
                    return;
                }

                int icount = 1, jcount = 1;
                for(int x=i;x<j;x++){
                    if(arr[x] == arr[j]){
                        icount++;
                    }else{
                        break;
                    }
                }

                for(int x=j;x>i;x--){
                    if(arr[x] == arr[j]){
                        jcount++;
                    }else{
                        break;
                    }
                }

                count += (icount * jcount);
                i += icount;
                j -= jcount;

                
            }else if(arr[i] + arr[j] > k) j--;
            else i++;
        }
       System.out.print(count);
    }
}
