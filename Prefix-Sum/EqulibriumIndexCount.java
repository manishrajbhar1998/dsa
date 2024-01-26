class EqulibriumIndexCount {

  public static void main(String[] args) {
    // int[] arr = { -3, 2, 4, -1 };
    int[] arr = { -7, 1, 5, 2, -4, 3, 0 };

    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i];
    }

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      long leftSum = 0, rightSum = 0;

      if (i != 0) {
        leftSum = arr[i - 1];
      }

      rightSum = arr[arr.length - 1] - arr[i];

      if (leftSum == rightSum) {
        count++;
      }
    }

    System.out.println("count: " + count);
  }
}
