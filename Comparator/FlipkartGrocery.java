import java.util.*;

public class FlipkartGrocery {

    static class Pair{
        int item;
        int price;

        Pair(int item,int price ){
            this.item = item;
            this.price = price;
        }
    }

    public static int solve(int[] A, int[] B) {

        List<Pair> pairs = new ArrayList<>();

        for(int i=0;i<A.length;i++){
            pairs.add(new Pair(A[i],B[i]));
        }

        Collections.sort(pairs,new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return Integer.compare(p1.item,p2.item);
            }
        });

         
        for (Pair pair : pairs) {
            System.out.println(pair.item+" "+pair.price);
        }

        return 0;

    }

    public static void main(String[] agrs){

        int[] A = {1, 3, 2, 3, 3};
        int[] B = {5, 6, 1, 3, 9};

        solve(A,B);
    }
}
