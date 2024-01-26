class Node {

  int data;
  Node prev;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class Basic {

  public static void main(String[] agrs) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    Node n5 = new Node(50);

    n1.next = n2;
    n2.prev = n1;
    n2.next = n3;
    n3.prev = n2;
    n3.next = n4;
    n4.prev = n3;
    n4.next = n5;
    n5.prev = n4;

    // Node temp = n1;
    // while(temp.next != null){
    //     System.out.print(temp.data+" ");
    //     temp = temp.next;
    // }
    // System.out.print(temp.data);

    // System.out.println();
    // System.out.print(temp.data+" ");
    // temp = temp.prev;
    // while(temp.prev != null){
    //     System.out.print(temp.data+" ");
    //     temp = temp.prev;
    // }
    // System.out.print(temp.data+" ");

    Node temp = n1;
    while (temp.next != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.print(temp.data + " ");
    System.out.println();

    Node t1 = n3.prev;
    Node t2 = n3.next;

    t1.next = t2;
    t2.prev = t1;

    n3.next = null;
    n3.prev = null;

    Node n6 = new Node(55);
        n6.next = n5;
        n6.prev = n5.prev;
        n5.prev.next = n6;
        n5.prev = n6;

    Node temp1 = n1;

    while (temp1.next != null) {
      System.out.print(temp1.data + " ");
      temp1 = temp1.next;
    }
    System.out.print(temp1.data + " ");
    System.out.println();
  }
}
