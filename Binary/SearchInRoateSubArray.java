class SearchInRoateSubArray {

  public static void main(String[] args) {
    int[] A = { 4, 5, 6, 7, 0, 1, 2, 3 };
    int k = 4;


    int s = 0;
    int e = A.length-1;

    while(s <= e){

      int m = s + (e - s)/2;

      if(A[m] == k){
        System.out.println(m);
      }

      if( A[s] < A[m]){
          if(k >= A[s] && k <= A[m]){
            e = m-1;
          }else{
            s = m+1;
          }
      }else{
        if(k >= A[m] && k <= A[e]){
          s = m+1;
        }else{
          e = m-1;
        }
      }
      
    }



















    // int l = 0, h = A.length - 1;

    // while (l <= h) {
    //   int m = (l + h) / 2;

    //   if (A[m] == k) {
    //     System.out.println(m);
    //     return;
    //   } else if (A[l] < A[m]) {
    //     if (k >= A[l] && k < A[m]) {
    //       h = m - 1;
    //     } else {
    //       l = m + 1;
    //     }
    //   } else {
    //     if (k > A[m] && k <= A[h]) {
    //       l = m + 1;
    //     } else {
    //       h = m - 1;
    //     }
    //   }
    // }
    // System.out.println("not found");
  }
}
