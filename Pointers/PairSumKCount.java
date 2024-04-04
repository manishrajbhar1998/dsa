class PairSumKCount {

  public static void main(String[] args) {
    // int[] A = { 1, 3, 3, 10, 23, 30, 30 };
    // int[] A = { 10, 10, 10, 10, 10, 15 };
    int[] A = { 1, 2, 2, 2, 4, 16, 16, 16, 23, 23, 30, 30 }; // 6 +
    int n = A.length;
    int k = 32;
    int ans = 0;

    int s = 0;
    int e = n-1;
        while (s < e) {
      int target = A[s] + A[e];
      if (target == k) {
        if (A[s] == A[e]) { // int[] A = { 10, 10, 10, 10, 10, 15 };
          int count = e - s + 1;
          ans += (count * (count - 1)) / 2;
          System.out.println(ans);
          return;
        } else {
          int i_count = 0, j_count = 0; // if  int[] A = { 1, 3, 3, 10, 23, 30, 30 };

          for (int i = s; i < n; i++) {
            if (A[s] == A[i]) i_count++; else break;
          }

          for (int i = e; i > s; i--) {
            if (A[i] == A[e]) j_count++; else break;
          }

          ans += (i_count * j_count);
          s += i_count;
          e -= j_count;
        }
      } else if (target > k) {
        e--;
      } else {
        s++;
      }
    }

    // while(s < e){

    //   int target = A[s] + A[e];
    //   if(target == k){

    //     if(A[s] == A[e]){
    //         int count = e - s + 1;
    //         ans += (count * (count - 1)) /2;
    //         return;
    //     }else{

    //       int i_count = 0, j_count = 0;

    //       for(int i=s;i<n;i++){
    //           if(A[i] == A[s]) i_count++;
    //           else break;
    //       }

    //       for(int j=e;j>s;j--){
    //           if(A[j] == A[e]) j_count++;
    //           else break;
    //       }

    //       ans += (i_count * j_count );
    //       s += i_count;
    //       e -= j_count;
          
    //     }


    //   }else if(target > k){
    //     e--;
    //   }else{
    //     s++;
    //   }
    // }
   
    System.out.println(ans);
  }
}


//  int s = 0, e = n - 1;
//     int ans = 0;

//     while (s < e) {
//       int target = A[s] + A[e];
//       if (target == k) {
//         if (A[s] == A[e]) { // int[] A = { 10, 10, 10, 10, 10, 15 };
//           int count = e - s + 1;
//           ans += (count * (count - 1)) / 2;
//           System.out.println(ans);
//           return;
//         } else {
//           int i_count = 0, j_count = 0; // if  int[] A = { 1, 3, 3, 10, 23, 30, 30 };

//           for (int i = s; i < n; i++) {
//             if (A[s] == A[i]) i_count++; else break;
//           }

//           for (int i = e; i > s; i--) {
//             if (A[i] == A[e]) j_count++; else break;
//           }

//           ans += (i_count * j_count);
//           s += i_count;
//           e -= j_count;
//         }
//       } else if (target > k) {
//         e--;
//       } else {
//         s++;
//       }
//     }
