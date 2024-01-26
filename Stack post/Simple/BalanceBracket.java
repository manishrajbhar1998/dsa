import java.util.Stack;
class BalanceBracket{

    public static boolean balanceBracket(String str){

        Stack<Character> st = new Stack<Character>();

        int n = str.length();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
            
                if(st.size() == 0) return false;
                if(ch == ')' && st.peek() == '(') st.pop();
                else if(ch == ']' && st.peek() == '[') st.pop();
                else if(ch == '}' && st.peek() == '{') st.pop();
                else return false;
            }
        }

        if(st.size() == 0) return true;
        else return false;

    }

    public static void main(String[] args){

        String str = "(([()])){}";
        System.out.println(balanceBracket(str));


    }
}