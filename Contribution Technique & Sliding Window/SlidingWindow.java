class SlidingWindow {

  public static void main(String[] args) {
    int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
    int n = arr.length;
    //Given an array having Melements return Mansubarray sums of ten K

    // way 1 brute force
    // int len = 5;
    // int s = 0;
    // int e = len - 1;
    // int ans = 0;
    // while (e < n) {
    //   int sum = 0;
    //   for (int i = s; i <= e; i++) {
    //     sum += arr[i];
    //   }
    //   System.out.print(sum + " ");
    //   if (sum > ans) {
    //     ans = sum;
    //   }
    //   s++;
    //   e++;
    // }
    // System.out.println("ans :: " + ans);

    // way 2 prefix-sum
    // int len = 5;
    // int s = 0;
    // int e = len - 1;
    // int ans = 0;
    // for (int i = 1; i < n; i++) {
    //   arr[i] = arr[i - 1] + arr[i];
    // }
    // while (e < n) {
    //   int sum = 0;
    //   if (s == 0) {
    //     sum = arr[e];
    //   } else {
    //     sum = arr[e] - arr[s - 1];
    //   }
    //   if (sum > ans) {
    //     ans = sum;
    //   }
    //   s++;
    //   e++;
    // }
    // System.out.println(ans + " :: ans");

    // way 3 sliding window
    // int k = 5;
    // int sum = 0;
    // int ans = 0;

    // for (int i = 0; i < k; i++) {
    //   sum += arr[i];
    // }
    // ans = sum;
    // int s = 1;
    // int e = k;

    // while (e < n) {
    //   sum = sum - arr[s - 1] + arr[e];
    //   if (sum > ans) {
    //     ans = sum;
    //   }
    //   e++;
    //   s++;
    // }

    // System.out.println("ans :: " + ans);

    // Minimum swaps Required to bring all ele <= B together (google problem base on sliding window)
    int[] A = { 1, 12, 10, 3, 14, 10, 5 };
    int B = 8;

    int k = 0;

    for (int i = 0; i < A.length; i++) {
      if (A[i] <= B) {
        k++;
      }
    }

    if (k == 0 || k == 1 || k == A.length) {
      System.out.println(0);
      return;
    }

    int badEle = 0;
    for (int i = 0; i < k; i++) {
      if (A[i] > B) {
        badEle++;
      }
    }

    int ans = badEle;
    int s = 1;
    int e = k;

    while (e < A.length) {
      if (A[s - 1] > B) {
        badEle--;
      }
      if (A[e] > B) {
        badEle++;
      }

      if (badEle < ans) {
        ans = badEle;
      }

      s++;
      e++;
    }

    System.out.println("ans :: " + ans);
  }
}
