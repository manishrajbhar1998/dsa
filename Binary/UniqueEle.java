class UniqueEle {

  public static void main(String[] args) {
    int[] A = { 6, 6, 2, 2, 7, 5, 5, 9, 9, 4, 4, 10, 10 };

    int n = A.length;

    if(n == 1 || A[0] != A[1]){
      System.out.println(0);
      return;
    }

    if(A[n-1] != A[n-2]){
      System.out.println(n-1);
      return;
    }

    int s = 0;
    int e = n-1;

    while(s <= e){
      int mid = s + (e - s)/2;

      if(A[mid] != A[mid-1] && A[mid] != A[mid+1]){
        System.out.println(mid);
        return;
      }

      if(A[mid] == A[mid-1]){
        mid -= 1;
      }

      if(mid % 2 == 0){
        s = mid + 2;
      }else{
        e = mid - 1;
      }
    }

    System.out.println("NO Unique element");
  }
}
