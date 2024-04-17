import java.util.*;

class NearestSmallestLeftEle{

    public static void main(String[] args){

        int[] arr = {4,5,2,10,10,3,12};
        int n = arr.length;
        int[] ans = new int[n];
        int[] ansIndex = new int[n];

        Stack<Integer> st = new Stack<>();

        // ele
        for(int i=0;i<arr.length;i++){

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

        // index
        //  for(int i=0;i<arr.length;i++){
        //     while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
        //         st.pop();
        //     }

        //     if(st.isEmpty()){
        //         ansIndex[i] = -1;
        //     }else{
        //         ansIndex[i] = st.peek();
        //     }

        //     st.push(i);
        // }

        // System.out.println(Arrays.toString(ansIndex));













        
        
        
    }
}