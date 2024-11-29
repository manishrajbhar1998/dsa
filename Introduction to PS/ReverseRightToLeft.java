import java.util.Arrays;

class ReverseRightToLeft {

  public static void reverseArr(int[] arr,int s,int e){

      while (s < e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--; 
      }
  }
 

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int k = 3;
    int n = arr.length;
    k = k % n;

    reverseArr(arr,0,n-1);
    reverseArr(arr,0,k-1);
    reverseArr(arr,k,n-1);

    System.out.println(Arrays.toString(arr));





  }
}
