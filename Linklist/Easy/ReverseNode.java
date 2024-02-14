package Easy;

public class ReverseNode {
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

    reverseNode(t1);
  }

  static void reverseNode(Node headRef){

        Node newHead = null;

        Node head = headRef;

        while(head != null){
            Node temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }

        while(newHead != null){
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
  }
}
