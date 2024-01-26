class PeakEle {

  public static void main(String[] args) {
    int[] A = { 1, 2, 3, 4, 5, 6, 7, 2 };

    int n = A.length;

    if (n == 1 || A[0] > A[1]) {
      System.out.println(A[0]);
      return;
    }
    if (A[n - 1] > A[n - 2]) {
      System.out.println(A[n - 1]);
      return;
    }

    int l = 1, h = n - 2;

    while (l <= h) {
      int m = (l + h) / 2;

      if (A[m] > A[m - 1] && A[m] > A[m + 1]) {
        System.out.println(A[m] + " " + m);
        return;
      } else if (A[m] > A[m - 1] && A[m] < A[m + 1]) {
        l = m + 1;
      } else {
        h = m - 1;
      }
    }

    System.out.println("no peak Element found");
  }
}
