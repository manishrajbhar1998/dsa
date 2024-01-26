import java.util.*;

class SubArraySumK {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 9, -4, 1, 5, 6, 2, 5 };
    int k = 11;

    HashSet<Integer> hs = new HashSet<>();

    for (int i = 1; i < arr.length; i++) {
      arr[i] = arr[i - 1] + arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    // for (int i = 0; i < arr.length; i++) {
    //   int target = arr[i] - k;
    //   if (hs.contains(target)) {
    //     System.out.println(arr[i] + " " + target);
    //   }

    //   hs.add(arr[i]);
    // }

    HashMap<Integer, Integer> hm = new HashMap<>();
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      int target = arr[i] - k;

      count += hm.getOrDefault(target, 0);
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }

    System.out.println("count :: " + count);
  }
}
