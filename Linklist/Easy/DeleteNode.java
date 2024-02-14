package Easy;

public class DeleteNode {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static void main(String[] agrs) {
    Node t1 = new Node(10);
    Node t2 = new Node(20);
    Node t3 = new Node(30);
    Node t4 = new Node(40);
    Node t5 = new Node(50);

    t1.next = t2;
    t2.next = t3;
    t3.next = t4;
    t4.next = t5;

    Node temp1 = t1;
    while (temp1 != null) {
      System.out.println(temp1.data);
      temp1 = temp1.next;
    }

    System.out.println("===================");

    deleteNode(t1, 4);
  }

  static void deleteNode(Node h, int pos) {
    if (pos == 0) {
      h = h.next;
    } else {
      Node temp = h;
      for (int i = 0; i < pos - 1; i++) {
        if (temp != null && temp.next != null) {
          temp = temp.next;
        }
      }
      temp.next = temp.next.next;
    }

    while (h != null) {
      System.out.println(h.data);
      h = h.next;
    }
  }
}
