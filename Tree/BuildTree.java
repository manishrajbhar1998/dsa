import java.util.Scanner;
import java.util.Stack;

class Node{

    Node left = null;
    Node right = null;
    int data;

    Node(int data){
        this.data = data;
    }
}

public class BuildTree {

    // create Tree
    public static Node createTree(){
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        if(val < 1){
            return null;
        }

        Node root = new Node(val);
        System.out.println("Enter value at "+val+" to the left side");
        root.left = createTree();
        System.out.println("Enter value at "+val+" to the right side");
        root.right = createTree();
        return root;
    }

    // PreOrderTraversal
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    // PreOrderTraversalItravation
    public static void preOrderTraversalItravation(Node root){
        Stack<Node> st = new Stack<>();
        Node curr = root;
        System.out.println();
        while (!st.isEmpty() || curr != null) {
            while(curr != null){
                System.out.print(curr.data+" ");
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            curr = curr.right;
        }
    }

    // inOrderTraversal
    public static void inOderTraversal(Node root){

        if(root == null){
            return;
        }

        inOderTraversal(root.left);
        System.out.print(root.data+" ");
        inOderTraversal(root.right);
    }

    // inOrderTraversalItravation
    public static void inOrderTraversalItravation(Node root){

        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (!st.isEmpty() || curr != null) {
            
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;

        }
    }

    // inOrderTraversal
    public static void postOderTraversal(Node root){

        if(root == null){
            return;
        }

        postOderTraversal(root.left);
        postOderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    // inOrderTraversalItravation
    public static void postOrderTraversalItravation(Node root){

        Stack<Node> st = new Stack<>();
        Node curr = root;
        Node prev = null;
        System.out.println();

        while (!st.isEmpty() || curr != null) {
            
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.peek();
            if(curr.right == null || curr.right == prev ){
                System.out.print(curr.data+" ");
                st.pop();
                prev = curr;
                curr = null;
            }else{
                curr = curr.right;
            }

        }
    }


    public static void main(String[] args) {
        
        Node root;
        root = createTree();

        // preOrderTraversal(root);
        // preOrderTraversalItravation(root);

        // inOderTraversal(root);
        // inOrderTraversalItravation(root);

        postOderTraversal(root);
        postOrderTraversalItravation(root);

    }
}
