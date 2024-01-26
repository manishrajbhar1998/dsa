class UniqueEle {

  public static void main(String[] args) {
    int[] A = { 6, 6, 2, 2, 7, 5, 5, 9, 9, 4, 4, 10, 10 };

    int n = A.length;
    if (n == 1 || A[0] != A[1]) {
      System.out.println(A[0]);
      return;
    }
    if (A[n - 1] != A[n - 2]) {
      System.out.println(A[n - 1]);
      return;
    }

    int l = 1, h = n - 2;

    while (l <= h) {
      int m = (l + h) / 2;

      if (A[m] != A[m - 1] && A[m] != A[m + 1]) {
        System.out.println(m);
        return;
      }

      if (A[m] == A[m - 1]) {
        m = m - 1;
      }

      if (m % 2 == 0) {
        l = m + 2;
      } else {
        h = m - 1;
      }
    }

    System.out.println("NO Unique element");
  }
}
