class BasicPairCount {

  public static void main(String[] args) {
    // char[] arr = { 'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g' };
    char[] arr = { 'a', 'd', 'g', 'a', 'g', 'a', 'g', 'f', 'g' };

    // Own Trial
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 'a') {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] == 'g') {
            System.out.print(
              arr[i] + "" + arr[j] + "(" + i + "," + j + ")" + " "
            );
          }
        }
        System.out.println();
      }
    }

    // Optimization idea

    int pair = 0, g = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == 'g') {
        g++;
      } else if (arr[i] == 'a') {
        pair += g;
      }
    }

    System.out.println(pair);
  }
}
