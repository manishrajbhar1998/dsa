class SpiralPrint {

  public static void main(String[] args) {
    int[][] mat = {
      { 1, 2, 3, 4, 5 },
      { 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15 },
      { 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25 },
    };

    int n = mat.length;

    System.out.println("2D Matrix Element");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("2D Sprial Matrix Element");
    int row = 0, col = 0;

    while (n > 1) {
      System.out.println("n :: " + n);
      for (int i = 1; i < n; i++) {
        System.out.print(mat[row][col] + " ");
        col++;
      }
      System.out.println();
      for (int i = 1; i < n; i++) {
        System.out.print(mat[row][col] + " ");
        row++;
      }
      System.out.println();

      for (int i = 1; i < n; i++) {
        System.out.print(mat[row][col] + " ");
        col--;
      }
      System.out.println();

      for (int i = 1; i < n; i++) {
        System.out.print(mat[row][col] + " ");
        row--;
      }
      System.out.println();

      row++;
      col++;
      n -= 2;
    }
    System.out.println("n :: " + n);
    if (n == 1) {
      System.out.println(mat[row][col]);
    }
  }
}
