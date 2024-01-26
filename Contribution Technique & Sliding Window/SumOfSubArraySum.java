class SumOfSubArraySum {

  public static void main(String[] args) {
    int[] arr = { 3, 4, 2 };

    int n = arr.length;
    // way 1 carryforward
    // int sumofsum = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   int sum = 0;
    //   for (int j = i; j < arr.length; j++) {
    //     sum += arr[j];
    //     System.out.println("sum :: " + sum);
    //     sumofsum += sum;
    //   }
    // }
    // System.out.println("sum :: " + sumofsum);

    // way 2 prefix
    // for (int i = 1; i < arr.length; i++) {
    //   arr[i] = arr[i - 1] + arr[i];
    // }

    // int sumofsum = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = i; j < arr.length; j++) {
    //     if (i == 0) {
    //       sumofsum += arr[j];
    //     } else {
    //       sumofsum += arr[j] - arr[i - 1];
    //     }
    //   }
    // }
    // System.out.println("sum :: " + sumofsum);

    // way 3 contribute tech
    // int ans = 0;
    //   for (int i = 0; i < n; i++) {
    //     int occ = (i + 1) * (n - i);
    //     int count = arr[i] * occ;
    //     System.out.println(count + " ");
    //     ans += count;
    //   }
    //   System.out.println(ans + "::  ans");
    // }

    // kadanes algorithem for find max subArray sum
    // int ans = arr[0];
    // int sum = arr[0];
    // for (int i = 1; i < n; i++) {
    //   if (sum < 0) {
    //     sum = 0;
    //   }
    //   sum += arr[i];
    //   if (sum > ans) {
    //     ans = sum;
    //   }
    // }
    // System.out.println(ans);
  }
}
