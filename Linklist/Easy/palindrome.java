package Easy;

public class palindrome {

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
    Node t4 = new Node(30);
    Node t5 = new Node(20);
    Node t6 = new Node(10);

    t1.next = t2;
    t2.next = t3;
    t3.next = t4;
    t4.next = t5;
    t5.next = t6;

    Node temp1 = t1;
    while (temp1 != null) {
      System.out.println(temp1.data);
      temp1 = temp1.next;
    }

    System.out.println("===================");

    System.out.println(palindrome(t1));
  }

  static boolean palindrome(Node h) {
    Node temp = h;
    Node mid = findMid(temp);
    Node h2 = reverse(mid.next);

    while (h != null && h2 != null) {
      if (h.data != h2.data) {
        return false;
      } else {
        h = h.next;
        h2 = h2.next;
      }
    }

    return true;
  }

  static Node findMid(Node h) {
    Node slow = h, fast = h;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  static Node reverse(Node h) {
    Node newHead = null;

    while (h != null) {
      Node temp = h;
      h = h.next;
      temp.next = newHead;
      newHead = temp;
    }

    return newHead;
  }
}
