import java.util.Arrays;

class BeggerOutSideTimple {

  public static void main(String[] agrs) {
    int[] beggers = new int[7];
    int[][] queries = { { 1, 3, 2 }, { 2, 5, 3 }, { 2, 4, 1 }, { 3, 6, 2 } };
    int n = beggers.length;


    for(int i=0;i<queries.length;i++){

      int s = queries[i][0];
      int e = queries[i][1];
      int v = queries[i][2];

      beggers[s] += v;
      if(e+1 < n){
        beggers[e+1] -= v;
      }
    }

    for(int i=1;i<n;i++){
      beggers[i] += beggers[i-1];
    }

    System.out.println(Arrays.toString(beggers));






















    // for (int i = 0; i < queries.length; i++) {
    //   int s = queries[i][0];
    //   int e = queries[i][1];
    //   int val = queries[i][2];

    //   beggers[s] += val;
    //   if (e+1 < beggers.length) {
    //     beggers[e + 1] -= val;
    //   }
    // }

    // for (int i = 1; i < beggers.length; i++) {
    //   beggers[i] += beggers[i - 1];
    // }

    // for (int i = 1; i < beggers.length; i++) {
    //   System.out.print(beggers[i] + " ");
    // }
  }
}
