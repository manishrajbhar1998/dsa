class FirstOccurence {

  public static void main(String[] agrs) {
    int[] arr = { 3, 3, 6, 6, 9, 12, 14, 19, 20, 23, 25, 27 };
    int k = 12;

    int n = arr.length;
    int l = 0, h = n - 1;
    int ans = -1;

    while (l <= h) {
      int m = (l + h) / 2;

      if (arr[m] == k) {
        ans = m;
        h = m - 1;
      } else if (arr[m] > k) {
        h = m - 1;
      } else {
        l = m + 1;
      }
    }

    System.out.println(ans);
  }
}
