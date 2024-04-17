import java.util.Scanner;

/**
 * TreeCreationLeftOrder
 */

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
  }
}

public class TreeCreationLeftOrder {

  static Scanner scan = new Scanner(System.in);

  public static Node createTree() {
    System.out.println("Enter data :: ");
    int n = scan.nextInt();
    if (n == -1) {
      return null;
    }
    Node node = new Node(n);
    System.out.println("Insert data in left of :: " + n);
    node.left = createTree();
    System.out.println("Insert data in right of :: " + n);
    node.right = createTree();
    return node;
  }

  public static void preOrderPrint(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrderPrint(root.left);
    preOrderPrint(root.right);

  }

  public static void inOrderPrint(Node root) {
    if (root == null) {
      return;
    }
    inOrderPrint(root.left);
    System.out.print(root.data + " ");
    inOrderPrint(root.right);

  }

  public static void postOrderPrint(Node root) {
    if (root == null) {
      return;
    }
    postOrderPrint(root.left);
    postOrderPrint(root.right);
    System.out.print(root.data + " ");

  }

  public static void main(String[] agrs) {

    Node root;
    root = createTree();
    Node temp1 = root;
    Node temp2 = root;
    Node temp3 = root;

    preOrderPrint(temp1);
    System.out.println();
    inOrderPrint(temp2);
    System.out.println();
    postOrderPrint(temp3);

  }

}