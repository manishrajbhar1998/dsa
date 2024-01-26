class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

    int s = 0;
    int e = arr.length - 1;

    while (s < e) {
      int temp = arr[s];
      arr[s] = arr[e];
      arr[e] = temp;

      s++;
      e--;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    // note and in range just need to change s and e value;
  }
}
