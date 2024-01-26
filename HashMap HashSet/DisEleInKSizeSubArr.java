import java.util.*;

class DisEleInKSizeSubArr {

  public static void main(String[] agrs) {
    int[] arr = { 2, 4, 3, 8, 3, 9, 9, 3 };
    int k = 4;

    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < k; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }

    System.out.println(hm.size());

    int s = 1;
    int e = k;
    while (e < arr.length) {
      hm.put(arr[s - 1], hm.get(arr[s - 1]) - 1);

      if (hm.get(arr[s - 1]) == 0) {
        hm.remove(arr[s - 1]);
      }

      hm.put(arr[e], hm.getOrDefault(arr[e], 0) + 1);

      System.out.println(hm.size());
      s++;
      e++;
    }
  }
}
