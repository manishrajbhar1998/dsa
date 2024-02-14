package Medium;

public class MergeShort {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public static void main(String[] agrs) {
    Node t1 = new Node(50);
    Node t2 = new Node(20);
    Node t3 = new Node(40);
    Node t4 = new Node(30);
    Node t5 = new Node(90);
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

    Node head = mergeShort(t1);

    while (head != null) {
      System.out.println(head.data);
      head = head.next;
    }

    System.out.println("===================");
  }

  static Node mergeShort(Node h) {

    if(h == null  || h.next == null){
        return h;
    }

    Node mid = findMiddle(h);
    Node h2 = mid.next;
    mid.next = null;

    h = mergeShort(h);
    h2 = mergeShort(h2);

    Node head = merge(h, h2);
    return head;
  }

  static Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  static Node merge(Node h1, Node h2) {
    if (h1 == null) return h2;
    if (h2 == null) return h1;

    Node head = null;

    if (h1.data < h2.data) {
      head = h1;
      h1 = h1.next;
    } else {
      head = h2;
      h2 = h2.next;
    }

    Node temp = head;

    while (h1 != null && h2 != null) {
      if (h1.data < h2.data) {
        temp.next = h1;
        h1 = h1.next;
      } else {
        temp.next = h2;
        h2 = h2.next;
      }
      temp = temp.next;
    }

    if(h1 != null){
        temp.next = h1;
    }else{
        temp.next = h2;
    }

    return head;
  }
}
