class SmallestPrimeFactor {

  public static void main(String[] args) {
    int n = 10;

    int[] arr = new int[n + 1];

    for (int i = 0; i <= n; i++) {
      arr[i] = i;
    }

    for (int i = 2; i * i <= n; i++) {
      if (arr[i] == i) {
        for (int j = i * i; j <= n; j += i) {
          if (arr[j] == j) {
            arr[j] = i;
          }
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      System.out.println(arr[i]);
    }
  }
}
