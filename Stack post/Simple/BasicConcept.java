import java.util.*;

class BasicConcept{

    public static void main(String[] agrs){

        Stack<Integer> st = new Stack<>();

        // part 1
        // System.out.println(st); // []
        // System.out.println(st.size()); // 0
        // System.out.println(st.peek()); // will give runtime error java.util.EmptyStackException
        // System.out.println(st.pop()); // will give complie time error java.util.EmptyStackException 
        // System.out.println(st.isEmpty()); // will true || false
        // st.push(); // will give error 
                   // required: Integer
                   // found: no arguments
        

        // part 2
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st); //[10, 20, 30, 40, 50]
        System.out.println(st.size()) // 5
        st.pop();
        System.out.println(st.size()) // 4
        st.peek() // will give top element




        
    }
}