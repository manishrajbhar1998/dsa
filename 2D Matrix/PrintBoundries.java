import java.util.Scanner;

class PrintBoundries {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2D Matrix Size ");
    // int n = sc.nextInt();
    // int[][] mat = new int[n][n];
    int[][] mat = {
      { 1, 2, 3, 4, 5 },
      { 6, 7, 8, 9, 10 },
      { 11, 12, 13, 14, 15 },
      { 16, 17, 18, 19, 20 },
      { 21, 22, 23, 24, 25 },
    };

    int n = mat.length;

    // System.out.println("Enter 2D Matrix Element row X col " + n + " x " + n);
    // for (int i = 0; i < n; i++) {
    //   for (int j = 0; j < n; j++) {
    //     mat[i][j] = sc.nextInt();
    //   }
    // }

    System.out.println("2D Matrix Element");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    int row = 0, col = 0;
    for (int i = 0; i < n - 1; i++) {
      System.out.print(mat[row][col] + " ");
      col++;
    }
    System.out.println();
    for (int i = 0; i < n - 1; i++) {
      System.out.print(mat[row][col] + " ");
      row++;
    }
    System.out.println();
    for (int i = 0; i < n - 1; i++) {
      System.out.print(mat[row][col] + " ");
      col--;
    }
    System.out.println();
    for (int i = 0; i < n - 1; i++) {
      System.out.print(mat[row][col] + " ");
      row--;
    }
  }
}
