import java.util.Arrays;

class MinimumDiffMatrix {

  public static void main(String[] args) {
    int[][] A = { { 7, 3 }, { 2, 1 }, { 4, 9 } };
    int mainAns = Integer.MAX_VALUE;

    for (int i = 0; i < A.length; i++) {
      Arrays.sort(A[i]);
    }

    for (int i = 0; i < A.length - 1; i++) {
      for (int j = 0; j < A[i].length; j++) {
        int k = A[i][j];

        int n = A[i + 1].length;
        int l = 0, h = n - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= h) {
          int m = (l + h) / 2;

          int diff = Math.abs(k - A[i + 1][m]);

          if (ans > diff) {
            ans = diff;
          }

          if (k == A[i + 1][j]) {
            ans = 0;
            break;
          } else if (A[i + 1][j] > k) {
            h = m - 1;
          } else {
            l = m + 1;
          }
        }

        if (mainAns > ans) {
          mainAns = ans;
        }
      }
    }

    System.out.println(mainAns);
  }
}
