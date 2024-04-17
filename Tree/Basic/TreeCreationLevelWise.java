import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

public class TreeCreationLevelWise {
  public static void main(String[] agrs) {

    Queue<Node> q = new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the root Element");
    int n = scan.nextInt();
    Node root = new Node(n);
    q.add(root);
    int first, second;

    while (!q.isEmpty()) {
      Node temp = q.peek();
      q.poll();
      System.out.println("Enter element to insert at left of :: "+temp.data);
      first = scan.nextInt();
      if (first > 0) {
        Node left = new Node(first);
        temp.left = left;
        q.add(temp.left);
      }
      System.out.println("Enter element to insert at right of :: "+temp.data);
      second = scan.nextInt();
      if (second > 0) {
        Node right = new Node(second);
        temp.right = right;
        q.add(temp.right);
      }

    }

  }
}
