import java.util.*;

class FindMissingInRange {

  public static void main(String[] args) {
    int[] rangeArr = { 1, 6, 4, 2 };
    // Brute force Approach
    // for (int i = 0; i < rangeArr.length; i++) {
    //   for (int j = i + 1; j < rangeArr.length; j++) {
    //     if (rangeArr[i] > rangeArr[j]) {
    //       int temp = rangeArr[j];
    //       rangeArr[j] = rangeArr[i];
    //       rangeArr[i] = temp;
    //     }
    //   }
    // }

    // for (int i = 0; i < rangeArr.length; i++) {
    //   System.out.println(rangeArr[i]);
    // }

    // ArrayList<Integer> arr = new ArrayList<Integer>();

    // for (int i = 0; i < rangeArr.length - 1; i++) {
    //   if (rangeArr[i] + 1 != rangeArr[i + 1]) {
    //     arr.add(rangeArr[i] + 1);
    //   }
    // }

    // int[] ans = new int[arr.size()];

    // for (int i = 0; i < ans.length; i++) {
    //   ans[i] = arr.get(i);
    // }

    // for (int i = 0; i < ans.length; i++) {
    //   System.out.println(ans[i]);
    // }
  }
}
