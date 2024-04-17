import java.util.Stack;

class BalancedParenthesis {

  public static void main(String[] args) {
    String parenthesis = "[{}(){}[]";

    Stack<Character> st = new Stack<>();

    for (int i = 0; i < parenthesis.length(); i++) {
      char parenthes = parenthesis.charAt(i);
      if (parenthes == ')' || parenthes == ']' || parenthes == '}') {
        if (parenthes == ')') {
          if (!st.isEmpty() && st.peek() == '(') {
            st.pop();
          } else {
            System.out.print("Not balance parenthesis");
            return;
          }
        } else if (parenthes == ']') {
          if (!st.isEmpty() && st.peek() == '[') {
            st.pop();
          } else {
            System.out.print("Not balance parenthesis");
            return;
          }
        } else if (parenthes == '}') {
          if (!st.isEmpty() && st.peek() == '{') {
            st.pop();
          } else {
            System.out.print("Not balance parenthesis");
            return;
          }
        }
      } else {
        st.push(parenthes);
      }
    }

    if(st.isEmpty()){

        System.out.print("Balance parenthesis");
    }else{
        System.out.print("Not Balance parenthesis");

    }
  }
}
