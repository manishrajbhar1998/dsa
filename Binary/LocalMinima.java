class LocalMinima {

  public static void main(String[] args) {
    int[] A = { 9, 8, 7, 3, 6, 4, 10, 5, 7, 10, 40 };

    int n = A.length;

    if (n == 1 || A[0] < A[1]) {
      System.out.println(A[0]);
      return;
    }
    if (A[n - 1] < A[n - 2]) {
      System.out.println(A[n - 1]);
      return;
    }

    int l = 1, h = n - 2;

    while (l <= h) {
      int mid = (l + h) / 2;

      if(A[mid] < A[mid-1] && A[mid] < A[mid+1]){
        System.out.print(A[mid]);
        return;
      }else if(A[mid] > A[mid-1] && A[mid] < A[mid+1] ){
        l = mid + 1;
      }else{
        h = mid - 1;
      }
    }

    System.out.println("no found");
  }
}
