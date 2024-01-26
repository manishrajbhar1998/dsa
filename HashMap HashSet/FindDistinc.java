import java.util.*;

class FindDistinc {

  public static void main(String[] args) {
    int[] arr = { 3, 5, 6, 5, 4 };

    HashSet<Integer> hs = new HashSet<Integer>();

    for (int i = 0; i < arr.length; i++) {
      if (hs.contains(arr[i])) {
        System.out.println(arr[i]);
        break;
      } else {
        hs.add(arr[i]);
      }
    }

    for (Integer ele : hs) {
      System.out.println("Ele:: " + ele);
    }
  }
}
