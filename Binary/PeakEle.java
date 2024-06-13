class PeakEle {

  public static void main(String[] args) {
    int[] A = { 1, 2, 3, 4, 5, 6, 7, 2 };

    int n = A.length;

    if(n == 1 || A[0] > A[1]){
      System.out.println(0);
      return;
    };

    if(A[n-1] > A[n-2]){
      System.out.println(n-1);
      return;
    };

    int s = 1;
    int e = n-2;

    while(s <= e){
      int mid = s + (e-s)/2;

      if(A[mid] > A[mid-1] && A[mid] > A[mid+1]){
        System.out.println(mid);
        return;
      }else if(A[mid] < A[mid+1] && A[mid] > A[mid-1]){
        s = mid + 1;
      }else{
        e = mid - 1;
      }
    }

    System.out.println("no peak Element found");
  }
}
