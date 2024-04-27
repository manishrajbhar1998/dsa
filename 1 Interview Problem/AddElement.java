import java.util.Arrays;

class AddElement {

  public static void main(String[] args) {
    int[] arr = new int[7];

    int[][] queries = { { 2, 6 }, { 0, -1 }, { 3, 2 }, { 5, 4 }, { 3, 3 } };

    for(int i=0;i<queries.length;i++){
      int s = queries[i][0];
      int v = queries[i][1];
      arr[s] += v;
    }

    for(int i=1;i<arr.length;i++){
        arr[i] += arr[i-1];
    }

    System.out.println(Arrays.toString(arr));

  }
}
