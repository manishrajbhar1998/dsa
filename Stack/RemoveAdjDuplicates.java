import java.util.Stack;

public class RemoveAdjDuplicates {
 
    public static void main(String[] args){

        String str = "ababaab";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){

            char a = str.charAt(i);

            if(st.isEmpty()){
                st.push(a);
            }else{
                if(st.peek() == a){
                    st.pop();
                }else{
                    st.push(a);
                }
            }
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        System.out.println("ans :: "+ans);
    }
}
