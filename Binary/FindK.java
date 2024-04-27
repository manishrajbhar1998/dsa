class FindK {

  public static void main(String[] args) {
    int[] arr = { 3, 6, 9, 12, 14, 19, 20, 23, 25, 27 };
    int k = 23;

    int n = arr.length;
    int l = 0, h = n - 1;

    while(l <= h){
      int mid = l + (h - l)/2;
      if(arr[mid] == k){
        System.out.println("ans :: "+mid);
        return;
      }else if(arr[mid] > k){
        h = mid - 1;
      }else{
        l = mid + 1;
      }
    }

    System.out.println("Not Found");
  }
}
