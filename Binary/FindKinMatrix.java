class FindKinMatrix {

  public static void main(String[] args) {
    int[][] A = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };

    int k = 16;

    for (int i = 0; i < A.length; i++) {
      int n = A[i].length;
      int l = 0, h = n - 1;

      while (l <= h) {
        int m = (l + h) / 2;

        if (A[i][m] == k) {
          System.out.println(i + " " + m);
          return;
        } else if (A[i][m] > k) {
          h = m - 1;
        } else {
          l = m + 1;
        }
      }
    }

    System.out.println("not found");
  }
}
