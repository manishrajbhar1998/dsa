class FindK {

  public static void main(String[] args) {
    int[] arr = { 3, 6, 9, 12, 14, 19, 20, 23, 25, 27 };
    int k = 23;

    int n = arr.length;
    int l = 0, h = n - 1;

    while (l <= h) {
      int m = (l + h) / 2;

      if (arr[m] == k) {
        System.out.println(m);
        return;
      } else if (arr[m] > k) {
        h = m - 1;
      } else {
        l = m + 1;
      }
    }

    System.out.println("Not Found");
  }
}
