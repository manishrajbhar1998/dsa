import java.util.Stack;

class NextGreaterEle{

    public static void main(String[] agrs){

        Stack<Integer> st = new Stack<>();
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length;
        int[] ans = new int[n];

        // way 1
        // for(int i=0;i<n;i++){
        //     ans[i] = -1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j] > arr[i]){
        //             ans[i] = arr[j];
        //             break;
        //         }
        //     }
        // }

        for(int i=n-1;i>=0;i--){
              while(st.size() > 0 && st.peek() < arr[i]){
                st.pop();
              }
              if(st.size() == 0) ans[i] = -1;
              else ans[i] = st.peek();
              st.push(arr[i]);
        }








        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}