class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class NthNodeFromLast {

  public static void printNthNode(Node head, int n) {

    // way 1
    // int count = 0;
    // Node temp = head;
    // while (temp != null) {
    //   count++;
    //   temp = temp.next;
    // }
    // int m = count - n + 1;
    // Node t2 = head;
    // for (int i = 1; i < m; i++) {
    //   t2 = t2.next;
    // }
    // System.out.println(t2.data);

    // way 2
    Node slow = head;
    Node fast = head;

    for(int i=1;i<=n;i++){
        fast = fast.next;
    }

    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }
    System.out.println(slow.data);

  }

  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(50);
    Node n3 = new Node(20);
    Node n4 = new Node(60);
    Node n5 = new Node(40);
    Node n6 = new Node(30);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    printNthNode(n1, 2);
  }
}
