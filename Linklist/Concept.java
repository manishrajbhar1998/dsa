import java.util.*;

class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Concept {

  public static void deleteNode(Node head, int k) {
    Node temp = head;

    if (k == 1) {
      head = head.next;
      printNode(head);
      return;
    }

    for (int i = 1; i < k - 1; i++) {
      // System.out.println(i + " " + temp.data);
      temp = temp.next;
    }

    // System.out.println(temp.data);

    if (temp.next != null) {
      temp.next = temp.next.next;
    }

    printNode(head);
  }

  public static void insertNode(Node head, int val, int k) {
    Node newNode = new Node(val);

    if (k == 1) {
      newNode.next = head;
      head = newNode;
      printNode(head);
      return;
    }

    Node temp = head;

    for (int i = 1; i < k - 1; i++) {
      if (temp != null) {
        if (temp.next == null) {
          break;
        }
        System.out.println(i + " " + temp.data);
        temp = temp.next;
      }
    }
    System.out.println(temp.data);
    newNode.next = temp.next;
    temp.next = newNode;
    System.out.println("=====================");
    printNode(head);
  }

  public static void printNode(Node head) {
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        System.out.print(temp.data);
      } else {
        System.out.print(temp.data + " -> ");
      }
      temp = temp.next;
    }
    System.out.println();
  }

  public static void printRec(Node head) {
    if (head == null) return;
    printRec(head.next);
    System.out.print(head.data + "  ");
  }

  public static void printKthNode(Node head, int k) {
    Node temp = head;
    for (int i = 1; i < k; i++) {
      temp = temp.next;
    }
    System.out.println(temp.data);
  }

  public static void main(String[] args) {
    //  simple understanding
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n1;

    Node temp = n1;
    Node h2 = n1;

    while (temp != null) {
      if (temp.next == h2) {
        temp.next = null;
      } else {
        temp = temp.next;
      }
    }
    printNode(h2);
    // printKthNode(n1, 2);
  }
}
