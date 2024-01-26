import java.util.*;

class PairSum {

  public static void main(String[] args) {
    int[] arr = { 2, 5, 2, 5, 8, 5, 2, 8 };
    int k = 10;

    // HashSet<Integer> hs = new HashSet<>();
    // for (int i = 0; i < arr.length; i++) {
    //   hs.add(arr[i]);
    // }
    // System.out.println(hs);

    // for (int i = 0; i < arr.length; i++) {
    //   int target = k - arr[i];

    //   if (hs.contains(target)) {
    //     System.out.println(target + " " + arr[i]);
    //   }

    //   hs.add(arr[i]);
    // }

    HashMap<Integer, Integer> hm = new HashMap<>();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      int target = k - arr[i];

      // this way
      //   if (hm.containsKey(target)) {
      //     count += hm.get(target);
      //   }
      // OR
      count += hm.getOrDefault(target, 0);

      // this way
      //   if (hm.containsKey(arr[i])) {
      //     hm.put(arr[i], hm.get(arr[i]) + 1);
      //   } else {
      //     hm.put(arr[i], 1);
      //   }
      // OR
      hm.put(arr[i], hm.getOrDefault(target, 0) + 1);
    }

    System.out.println("count :: " + count);
  }
}
