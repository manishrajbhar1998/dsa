package Medium;

/**
 * DetectCycle
 */
public class DetectCycle {

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

    t6.next = t3;

    // In caes of Cycly it will go infinite loop that why its commented
    // Node temp1 = t1;

    // find Cycly present or not
    // boolean isCycle = detectCycle(t1);
    // System.out.println(isCycle);

    findCycleNode(t1);
  }

  static boolean detectCycle(Node head) {
    if (head == null || head.next == null) {
      return false;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (slow == fast) {
        return true;
      }
    }

    return false;
  }

  static void findCycleNode(Node head) {
    boolean isCycly = false;
    if (head == null || head.next == null) {
      System.out.println(isCycly);
      return;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (slow == fast) {
        isCycly = true;
        break;
      }
    }

    System.out.println("Here Reached");

    if (isCycly == false) {
      System.out.println(isCycly);
      return;
    }

    Node p1 = head;
    Node p2 = slow;

    while (p1 != p2) {
      p1 = p1.next;
      p2 = p2.next;
    }

    System.out.println("Cycly detection point :: " + p1.data);

    Node end = p1;
    while (end.next != p1) {
      end = end.next;
    }

    end.next = null;

    System.out.println("===================");

    while (p1 != null) {
      System.out.println(p1.data);
      p1 = p1.next;
    }

    System.out.println("===================");
  }
}
