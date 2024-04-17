package sorting.customComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FactorShort {

    public static int factors(int n){

        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n % i == 0){
                if( i == n/i) count++;
                else count += 2;
            }
        }

        return count;
    }

  public static void main(String[] args) {

    int[] arr = { 9, 3, 10, 6, 4 };

    ArrayList<Integer> al = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      al.add(arr[i]);
    }

    Collections.sort(al,new Comparator<Integer>() {
        public int compare(Integer a, Integer b){
            int fa = factors(a);
            int fb = factors(b);

            if(fa < fb) return -1;
            else if(fb < fa) return 1;
            else{
                return a-b;
            }
        }
    });

    System.out.println(al);
  }


}
