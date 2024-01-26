import java.util.*;

class NearestSmallestLeftEle{

    public static void main(String[] args){

        int[] arr = {4,5,2,10,10,3,12};
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }

            if(st.size() > 0){ans[i] = st.peek();}
            else{
                ans[i] = -1;
            }

            st.push(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        
        
    }
}