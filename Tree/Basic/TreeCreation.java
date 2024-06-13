import java.util.*;
import java.util.Stack;

class Node {

  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

class TreeCreation {

  public static Node buildTree(Node root) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the data :: ");
    int data = scan.nextInt();
    root = new Node(data);

    if (data == -1) {
      return null;
    }

    System.out.println("Insert data in left of :: " + data);
    root.left = buildTree(root.left);
    System.out.println("Insert data in right of :: " + data);
    root.right = buildTree(root.right);
    return root;
  }

  static void levelOrderTraversal(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (q.size() != 0) {
      Node temp = q.remove();

      if (temp == null) {
        System.out.println();
        if (q.size() != 0) {
          q.add(null);
        }
      } else {
        System.out.print(temp.data + " ");

        if (temp.left != null) {
          q.add(temp.left);
        }

        if (temp.right != null) {
          q.add(temp.right);
        }
      }
    }
  }

  static void reversLevelOderTraversal(Node root) {
    ArrayList<Integer> al = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (q.size() != 0) {
      Node temp = q.remove();
      al.add(temp.data);
      if (temp.right != null) {
        q.add(temp.right);
      }
      if (temp.left != null) {
        q.add(temp.left);
      }
    }

    for (int i = al.size() - 1; i >= 0; i--) {
      System.out.print(al.get(i) + " ");
    }
  }

  static void preOderTraversal(Node root) {
    // DLR
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preOderTraversal(root.left);
    preOderTraversal(root.right);
  }

  static void preOderTraversalWithOutRec(Node root) {
    // DRL
    Stack<Node> st = new Stack<>();
    st.push(root);

    while (st.size() != 0) {
      Node temp = st.pop();
      System.out.print(temp.data + " ");
      if (temp.right != null) {
        st.push(temp.right);
      }
      if (temp.left != null) {
        st.push(temp.left);
      }
    }
  }

  static void inOderTraversal(Node root) {
    if (root == null) {
      return;
    }

    inOderTraversal(root.left);
    System.out.print(root.data + " ");
    inOderTraversal(root.right);
  }

  static void inOderTraversalWithOutRec(Node root) {
    Stack<Node> st = new Stack<>();
    Node curr = root;

    while (curr != null || st.size() > 0) {
      while (curr != null) {
        st.push(curr);
        curr = curr.left;
      }
      curr = st.pop();
      System.out.print(curr.data + " ");
      curr = curr.right;
    }
  }

  static void postOderTraversal(Node root) {
    if (root == null) {
      return;
    }

    postOderTraversal(root.left);
    postOderTraversal(root.right);
    System.out.print(root.data + " ");
  }

  static void postOderTraversalWithoutRec(Node root) {
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();

    st1.push(root);

    while (st1.size() != 0) {
      Node temp = st1.pop();
      st2.push(temp);

      if (temp.left != null) {
        st1.push(temp.left);
      }

      if (temp.right != null) {
        st1.push(temp.right);
      }
    }

    while (st2.size() != 0) {
      Node temp = st2.pop();
      System.out.print(temp.data + " ");
    }
  }

  public static void main(String[] args) {
    Node root = null;
    root = buildTree(root);
    preOderTraversal(root);
    System.out.println();
    // preOderTraversalWithOutRec(root);

    // inOderTraversal(root);
    // System.out.println();
    // inOderTraversalWithOutRec(root);

    // postOderTraversal(root);
    // System.out.println();
    // postOderTraversalWithoutRec(root);

    // levelOrderTraversal(root);
    // System.out.println();
    // reversLevelOderTraversal(root);

  }
}
