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
  

        Node root = null;
        // creating a tree
        root = buildTree(root);

    }
}