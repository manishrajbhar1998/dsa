class CountOfEven {

  public static void main(String[] args) {
    int[] arr = { 2, 4, 3, 7, 9, 8, 6, 3, 4, 9 };

    int[][] q = { { 4, 8 }, { 3, 9 }, { 2, 7 }, { 0, 4 } };

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        arr[i] = 1;
      } else {
        arr[i] = 0;
      }
    }

    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i];
    }

    for (int i = 0; i < q.length; i++) {
      int left = q[i][0], right = q[i][1];

      if (left == 0) {
        System.out.print(arr[right] + " ");
      } else {
        System.out.print(arr[right] - arr[left - 1] + " ");
      }
    }
  }
}
