import java.util.Stack;

public class Minimum_Add_to_Make_Parentheses_Valid_921 {

  public static void main(String[] args) {

    String str = "()()"; // ()))(( ()() ((())

    int open = 0;
    int close = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == '(') {
        open++;
      } else if (ch == ')' && open > 0) {
        open--;
      } else {
        close++;
      }
    }

    System.out.println(open);
    System.out.println(close);


    // with Stack Approach
    // Stack<Character> stack = new Stack<>();
    // for(int i=0;i<str.length();i++){
    // char ch = str.charAt(i);
    // if(stack.size() == 0){
    // stack.push(ch);
    // }else{
    // if(stack.peek() == '(' && ch == ')'){
    // stack.pop();
    // }else{
    // stack.push(ch);
    // }
    // }
    // }
    // System.out.println(stack.size());
  }
}
