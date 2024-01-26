import java.util.*;

class CopyStack {

  public static void main(String[] agrs) {
    Stack<Integer> st = new Stack<>();

    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    Stack<Integer> rt = new Stack<>();
    while (st.size() > 0) {
      rt.push(st.pop());
    }

    Stack<Integer> ct = new Stack<>();
    while (rt.size() > 0) {
      ct.push(rt.pop());
    }

    System.out.println(ct);
  }
}
