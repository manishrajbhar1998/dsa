import java.util.Stack;

public class InfixToPostfix {

  public static int precedence(char operator) {
    if (operator == '^') {
      return 3;
    } else if (operator == '*' || operator == '/') {
      return 2;
    } else if (operator == '+' || operator == '-') {
      return 1;
    }
    return 0;
  }

  public static boolean isOperator(char c) {
    return (
      c == '+' ||
      c == '-' ||
      c == '*' ||
      c == '/' ||
      c == '^' ||
      c == '(' ||
      c == ')'
    );
  }

  public static void main(String[] agrs) {
    String infix = "A+B*C-D*(F+G*K)+L*M";

    Stack<Character> st = new Stack<>();

    String ans = "";

    for (int i = 0; i < infix.length(); i++) {
      char a = infix.charAt(i);

      if (isOperator(a)) {
        if (a == '(') {
          st.push(a);
        } else if (a == ')') {
          while (!st.isEmpty() && st.peek() != '(') {
            ans += st.pop();
          }
          st.pop();
        } else {
          while (!st.isEmpty() && precedence(a) <= precedence(st.peek())) {
            ans += st.pop();
          }
          st.push(a);
        }
      } else {
        ans += a;
      }
    }

    while (!st.isEmpty()) {
      ans += st.pop();
    }

    System.err.println("ans :: "+ ans);
  }
}
