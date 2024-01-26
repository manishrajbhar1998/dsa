import java.util.*;

class SubArrayZero {

  public static void main(String[] args) {
    // find subArray sum = 0;
    int[] arr = { 0, 1, 3, -7, 3, -3, 6 };
    int key = 0;
    int count = 0;

    // using 3 loop
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = i; j < arr.length; j++) {
    //     int sum = 0;
    //     for (int k = i; k <= j; k++) {
    //       sum += arr[k];
    //       System.out.print(arr[k] + " ");
    //     }
    //     System.out.println();
    //     // System.out.println(i + " " + j + " " + sum);
    //     if (sum == key) {
    //       count++;
    //     }
    //   }
    // }
    // System.out.println("count :: " + count);

    // using 2 loop
    // for (int i = 0; i < arr.length; i++) {
    //   int sum = 0;
    //   for (int j = i; j < arr.length; j++) {
    //     sum += arr[j];
    //     System.out.println(i + " " + j + " " + sum);
    //     // System.out.print(arr[j] + " ");
    //     if (sum == key) {
    //       count++;
    //     }
    //   }
    //   System.out.println();
    // }
    // System.out.println("count :: " + count);

    // using pSum
    int[] pSum = new int[arr.length];
    pSum[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      pSum[i] = pSum[i - 1] + arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(pSum[i] + " ");
    }

    // System.out.println();
    // for (int i = 0; i < pSum.length; i++) {
    //   for (int j = i; j < pSum.length; j++) {
    //     if (i == 0) {
    //       if (pSum[j] == 0) {
    //         count++;
    //       }
    //     } else {
    //       if (pSum[j] - pSum[i - 1] == 0) {
    //         count++;
    //       }
    //     }
    //   }
    // }
    // System.out.println("count :: " + count);
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < pSum.length; i++) {
      if (pSum[i] == 0) count++;
      if (hm.containsKey(pSum[i])) {
        count += hm.get(pSum[i]);
        hm.put(pSum[i], hm.get(pSum[i]) + 1);
      } else {
        hm.put(pSum[i], 1);
      }
    }
    System.out.println("count :: " + count);
  }
}
