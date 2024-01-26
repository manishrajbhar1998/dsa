class KDiff {

  public static void main(String[] args) {
    int A = { 1, 3, 6, 8, 11, 14, 18, 25 };
    int k = 5;

    int i = 0;
    int j = 1;
    int n = A.length;

    while (j < n) {
      if (A[j] - A[i] == k) {
        System.out.println(A[j] - A[i]);
        break;
      } else if (A[j] - A[i] > k) {
        i++;
        if (i == j) {
          j++;
        }
      } else {
        j++;
      }
    }

    System.out.println("Not found");
  }
}
