import java.util.Arrays;
import java.util.Stack;

class ReverseString{
    
    public static void main(String[] args) {
        
        // for GFG
        // String S = "i.like.this.program.very.much";
        // Stack<String> st = new Stack<>();
        
        // String ans = "";
        // for(int i=0;i<S.length();i++){

        //     char ch = S.charAt(i);
        //     if((ch >= 'A' || ch >= 'a') && (ch <= 'Z' || ch <= 'z')){
        //         ans += ch;
                
        //     }else{
        //         ans = ch+ans;
        //         st.push(ans);
        //         ans = "";
        //     }
        // }

        // st.push(ans);

        // String ref = "";
        // while(st.size() > 0){
        //     ref += st.pop();
        // }

        // System.out.println(ref);

        // for leetcode
        String s = "the sky is blue";
        String[] str = s.trim().split("\\s+");
        

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        out += str[0];

        System.out.println(out);

    }
}