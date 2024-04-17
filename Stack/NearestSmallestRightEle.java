import java.util.*;

class NearestSmallestRightEle{

    public static void main(String[] agrs){

        int[] arr = {5,8,11,14,7,10,13,6,9,10,10,2,5};
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){

            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);

        }

        System.out.println(Arrays.toString(ans));
    }
}