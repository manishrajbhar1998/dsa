import java.util.*;

class Basic {

  public static void main(String[] agrs) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    hm.put(10, 1);
    hm.put(20, 1);
    hm.put(30, 1);
    hm.put(40, 1);
    hm.put(50, 1);

    // System.out.println(hm);

    HashSet<Integer> hs = new HashSet<>();

    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    hs.add(50);
    hs.add(60);

    System.out.println(hs);
    System.out.println(hs.contains(60));
    System.out.println(hs.remove(60));
    System.out.println(hs.contains(60));
  }
}
