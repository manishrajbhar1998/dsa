import java.util.*;

class CommonEle {

  public static void main(String[] args) {
    int[] A = { 1, 2, 2, 1 };
    int[] B = { 2, 3, 1, 2 };

    HashMap<Integer, Integer> hm = new HashMap<>();
    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i < A.length; i++) {
      hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
    }

    for (int i = 0; i < B.length; i++) {
      if (hm.containsKey(B[i]) && hm.get(B[i]) > 0) {
        ans.add(hm.get(B[i]));
        hm.put(B[i], hm.get(B[i]) - 1);
      }
    }

    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
  }
}
