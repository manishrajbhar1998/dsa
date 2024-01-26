class RangeSumQuery {

  public static void main(String[] args) {
    int[] arr = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };

    int[] prefix = new int[arr.length];

    int[][] q = { { 4, 8 }, { 3, 7 }, { 1, 3 }, { 7, 7 }, { 3, 6 }, { 0, 4 } };

    prefix[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    for (int i = 0; i < prefix.length; i++) {
      System.out.print(prefix[i] + " ");
    }

    System.out.println();
    for (int i = 0; i < q.length; i++) {
      int left = q[i][0], right = q[i][1];
      if (left == 0) {
        System.out.print(prefix[right] + " ");
      } else {
        System.out.print(prefix[right] - prefix[left - 1] + " ");
      }
    }
  }
}
