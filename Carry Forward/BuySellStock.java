class BuySellStock {

  public static void main(String[] args) {
    // int[] arr = { 3, 5, 7, 2, 4, 3, 8, 6 };
    int[] arr = { 1, 4, 5, 2, 4 };

    int bsp = arr[arr.length - 1], ans = 0;

    for (int i = arr.length - 2; i >= 0; i--) {
      int profit = bsp - arr[i];
      if (arr[i] > bsp) {
        bsp = arr[i];
      }

      if (profit > ans) {
        ans = profit;
      }
    }

    System.out.println("BuySellStock " + ans);
  }
}
