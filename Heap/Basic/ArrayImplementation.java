package Basic;

import java.util.*;

/**
 * ArrayImplementation
 */
public class ArrayImplementation {

  public static void insert(ArrayList<Integer> al, int val) {
    System.out.println(al);
    al.add(val);
    int i = al.size()-1;
    while(i > 0){
      int pi = (i-1)/2;
      if(al.get(i) < al.get(pi)){
        int temp = al.get(i);
        al.set(i,al.get(pi));
        al.set(pi,temp);
        i = pi;
      }else{
        break;
      }
    }








    // al.add(val);
    // int i = al.size() - 1;
    // while (i > 0) {
    //   int pi = (i - 1) / 2;
    //   if (al.get(i) < al.get(pi)) {
    //     int pval = al.get(pi);
    //     int chval = al.get(i);
    //     al.set(pi, chval);
    //     al.set(i, pval);
    //     i = pi;
    //   } else {
    //     break;
    //   }
    // }
  }

  public static void heapfy(ArrayList<Integer> al, int i) {
    int n = al.size() - 1;

    while (i < n) {
      int lci = 2 * i + 1, rci = 2 * i + 2;
      if (lci < n && rci < n) {
        int parEle = al.get(i), lEle = al.get(lci), rEle = al.get(rci);
        if (parEle < lEle && parEle < rEle) {
          break;
        } else {
          if (lEle < rEle) {
            al.set(i, lEle);
            al.set(lci, parEle);
            i = lci;
          } else {
            al.set(i, rEle);
            al.set(rci, parEle);
            i = rci;
          }
        }
      }else if(lci < n){
        int parEle = al.get(i), lEle = al.get(lci);
        if(parEle < lEle){
            break;
        }else{
            al.set(i, lEle);
            al.set(lci, parEle);
            i = lci;
        }
      }else{
        break;
      }
    }
  }

  public static int getMin(ArrayList<Integer> al) {
    int e = al.size() - 1;
    int s = 0;
    int temp = al.get(e);
    al.set(e, al.get(s));
    al.set(s, temp);
    int ans = al.remove(e);
    heapfy(al, 0);
    return ans;
  }

  public static void main(String[] agrs) {
    ArrayList<Integer> al = new ArrayList<>();

    al.add(3);
    al.add(5);
    al.add(10);
    al.add(6);
    al.add(8);
    al.add(12);
    al.add(13);
    al.add(10);
    al.add(12);
    al.add(15);
    al.add(11);

    System.out.println(al);
    insert(al, 2);
    System.out.println(al);

    // int minEle1 = getMin(al);
    // System.out.println(minEle1);
    // int minEle2 = getMin(al);
    // System.out.println(minEle2);
    // System.out.println(al);

  }
}
