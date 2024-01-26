import java.util.Stack;

class RemoveConsecutiveSubSequance{

    public static int[] remove(int[] arr){

        Stack<Integer> st = new Stack<Integer> ();
        for(int i=0;i<arr.length;i++){
            if(st.size() == 0 || st.peek() != arr[i]){
                st.push(arr[i]);
            }else{
                if(i == arr.length-1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        int[] ans = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }

    public static void main(String[] agrs){

        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2,2,2};

        int[] ans = remove(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}