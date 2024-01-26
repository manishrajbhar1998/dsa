class MeanOfArray {

  public static int rec(int[] arr, int index) {
    if (index == arr.length) {
      return 0;
    }

    int res = rec(arr, index + 1);
    int myResult = res + arr[index];
    return myResult;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 7, 8, 10, 20 };

    int totalEle = arr.length;
    int index = 0;
    int sum = rec(arr, index);
    System.out.println("recMean :: " + sum / totalEle);
  }
}
