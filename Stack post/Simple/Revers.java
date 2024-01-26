import java.util.*;

class Revers {

    public static void pushBottom(Stack<Integer> st,int n){

            if(st.size() == 0){
                st.push(n);
                return;
            }

            int top = st.pop();
            pushBottom(st,n);
            st.push(top);

    }

    public static void reverse(Stack<Integer> st){

        if(st.size() == 1){
            return;
        }
        int x = st.pop();
        reverse(st);
        pushBottom(st,x);
    }

  public static void main(String[] agrs) {
    Stack<Integer> st = new Stack<>();

    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    System.out.println(st);
    reverse(st);
    System.out.println(st);

    
  }
}
