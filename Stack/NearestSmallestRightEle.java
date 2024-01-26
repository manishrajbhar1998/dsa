import java.util.*;

class NearestSmallestRightEle{

    public static void main(String[] agrs){

        int[] arr = {5,8,11,14,7,10,13,6,9,10,10,2,5};
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.size() > 0){
                ans[i] = st.peek();
            }else{
                ans[i] = -1;
            }
            st.push(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}