class AddElement {

  public static void main(String[] args) {
    int[] arr = new int[7];
    long[] prefixSum = new long[7];

    int[][] queries = { { 2, 6 }, { 0, -1 }, { 3, 2 }, { 5, 4 }, { 3, 3 } };

    for (int i = 0; i < queries.length; i++) {
      int index = queries[i][0];
      int ele = queries[i][1];

      arr[index] += ele;
    }

    prefixSum[0] = arr[0];
    for (int i = 1; i < prefixSum.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    for (int i = 0; i < prefixSum.length; i++) {
      System.out.print(prefixSum[i] + " ");
    }
  }
}
