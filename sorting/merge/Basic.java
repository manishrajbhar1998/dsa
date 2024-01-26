class Basic {

  public static void merge(int[] A, int s, int m, int e) {
    int[] c = new int[e - s + 1];
    int p1 = s;
    int p2 = m + 1;
    int k = 0;

    while (p1 <= m && p2 <= e) {
      if (A[p1] < A[p2]) {
        c[k] = A[p1];
        p1++;
        k++;
      } else {
        c[k] = A[p2];
        p2++;
        k++;
      }
    }

    while (p1 <= m) {
      c[k] = A[p1];
      p1++;
      k++;
    }

    while (p2 <= e) {
      c[k] = A[p2];
      p2++;
      k++;
    }

    for (int i = 0; i < c.length; i++) {
      A[i + s] = c[i];
    }
  }

  public static void mergeSort(int[] arr, int s, int e) {
    if (s == e) {
      return;
    }

    int m = (s + e) / 2;

    mergeSort(arr, s, m); // 1
    mergeSort(arr, m + 1, e); // 2
    merge(arr, s, m, e);
  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 6, 9 };

    int n = arr.length;

    mergeSort(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
