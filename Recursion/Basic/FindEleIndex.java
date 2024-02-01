import java.util.*;

public class FindEleIndex {

    static ArrayList<Integer> resolve(int[] arr,int target,int index){

        ArrayList<Integer> al = new ArrayList<>();
        if(index == arr.length){
            return al;
        }

        if(arr[index] == target){
            al.add(index);
        }

        ArrayList<Integer> ansList = resolve(arr, target, ++index);
        al.addAll(ansList);
        return al;
    }

    public static void main(String[] agrs){

        int[] arr = {1,2,4,5,3,5};

        System.out.println(resolve(arr,5,0));
    }
    

}
