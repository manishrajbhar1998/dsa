import java.util.*;

class Node{
    int data;
    Node left;
    Node right; 

    Node(int data){
        this.data = data;
    }                                  
}
class TreeCreation{
    public static Node buildTree(Node root){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data value :: ");
        int data = sc.nextInt();
        root = new Node(data);
        System.out.println("================");

        if(data == -1){
            return null;
        }

        System.out.println("Enter data for inserting left side :: "+data);
        buildTree(root.left);
        System.out.println("Enter data for inserting right side :: "+data);
        buildTree(root.right);
        return root;
    }

    public static void leveOderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(q.size() > 0){

            Node temp = q.peek();
            System.out.println(temp.data);
            q.poll();

            if(temp.left != -1){
                q.add(temp.left);
            }

            if(temp.right != -1){
                q.add(temp.right);
            }
        }

    }

    public static void main(String[] args){
        Node root = null;
        // creating a tree
        root = buildTree(root);
        leveOderTraversal(root);

    }
}