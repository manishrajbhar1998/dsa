class SumOfSubMatrix {

  public static void main(String[] args) {
    int[][] mat = {
      { 2, 4, 3, -1, 6, 5, 4, 3 },
      { 3, 2, 6, 8, 1, 10, 3, 2 },
      { 5, 4, 3, 2, 9, 3, 2, 8 },
      { 6, 7, 3, 2, 10, 11, 14, 16 },
      { 8, 2, 4, 1, -4, -9, 4, 2 },
      { 7, 6, 7, 3, 4, 2, 9, 11 },
    };

    int tfrow = 2, tfcol = 1;
    int brrow = 4, brcol = 4;

    int sum = 0;
    for (int i = tfrow; i <= brrow; i++) {
      for (int j = tfcol; j <= brcol; j++) {
        System.out.print(mat[i][j] + " ");
        sum += mat[i][j];
      }
      System.out.println();
    }

    System.out.println("Sum of submatrix :: " + sum);
  }
}
