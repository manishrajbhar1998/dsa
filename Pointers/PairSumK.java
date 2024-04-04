import java.util.*;

class PairSumK {

  public static void main(String[] args) {
    int[] A = {8, 9, 1, -2, 4, 5, 11, -6, 4};

    int n = A.length;
    int k = 6;

    // Approch one    nestLoop         // TC = O(n^2)  and SC = O(1)
    // for(int i=0;i<n;i++){
    //     for(int j = i+1;j<n;j++){
    //         if(A[i]+A[j] == k){
    //             System.out.println(A[i]+A[j]+" "+i+" "+j);
    //         }
    //     }
    // }

    // Aproach two  // hasSet
    // HashSet<Integer> hs = new HashSet<>();  // TC = O(n)  and SC = O(n)
    // for(int i=0;i<n;i++){
    //     int target = k - A[i];
    //     if(hs.contains(target)){
    //         System.out.println(target+" "+A[i]);
    //     }
    //     hs.add(A[i]);
    // }

    // Approach three  Binary
    // int[] A = { 3, 7, 8, 11, 14, 19, 20 };
    // int n = A.length;
    // int k = 25;
    // for (int i = 0; i < n; i++) {      // TC = O(n*logn)  and SC = O(1)
    //   int target = k - A[i];
    //   int s = i, e = n - 1;
    //   while (s <= e) {
    //     int m = (s + e) / 2;
    //     if (A[m] == target) {
    //       System.out.println(A[m] + " " + m);
    //       return;
    //     } else if (A[m] > target) {
    //       e = m - 1;
    //     } else {
    //       s = m + 1;
    //     }
    //   }
    // }

    // System.out.println("pair value not found");

    // Approach 4 pointers
    // int[] A = { 3, 7, 8, 11, 14, 19, 20 };
    // int n = A.length;
    // int k = 34;

    int s = 0;
    int e = n-1;

    while(s < e){
        int target = A[s] + A[e];
        if(target == k){
          System.out.println(A[s]+" "+A[e]);
          return;
        }else if(target > k){
          e--;
        }else{
          s++;
        }
    }




    // int s = 0, e = n - 1;
    // while (s < e) {
    //   int target = A[s] + A[e];
    //   if (target == k) {
    //     System.out.println(A[s] + " " + A[e]);
    //     return;
    //   } else if (target > k) {
    //     e--;
    //   } else {
    //     s++;
    //   }
    // }

    System.out.println("pair value not found");
  }
}
