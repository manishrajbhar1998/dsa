import java.util.*;

class PrintFrequncey {

  public static void main(String[] args) {
    int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };

    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (hm.containsKey(arr[i])) {
        hm.put(arr[i], hm.get(arr[i]) + 1);
      } else {
        hm.put(arr[i], 1);
      }
    }

    // ternary in java works
    int val = hm.containsKey(12) ? hm.get(2) : 0;
    System.out.println(val);
    // for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
    //   System.out.println(
    //     "key: " + entry.getKey() + " value: " + entry.getValue()
    //   );
    // }
  }
}
