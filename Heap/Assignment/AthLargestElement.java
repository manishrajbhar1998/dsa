package Assignment;

import java.util.*;

public class AthLargestElement {

  public static void main(String[] args) {
    // int A = 4;
    // int[] B = { 1, 2, 3, 4, 5, 6 };
    int A = 2;
    int[] B = { 15, 20, 99, 1 };
    Arrays.sort(B);
    int n = B.length;
    int[] ans = new int[n];
    int count = 0;
    while (count < n) {
      if (A - 1 > count) {
        ans[count] = -1;
      } else {
        int temp = 0;
        for (int i = count; i >= 0; i--) {
          if (temp < A - 1) {
            temp++;
          }
        }
        ans[count] = B[count - temp];
      }
      count++;
    }

    System.out.println(Arrays.toString(ans));
  }
}
