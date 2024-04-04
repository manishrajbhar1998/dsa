class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
    next = null;
  }
}

public class ConceptRevision {

  // print
  public static void print(Node head) {
    Node temp = head;
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  // get count
  public static int count(Node head) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }

    return count;
  }

  // access kth Node
  public static void accesskthNode(Node head, int k) {
    Node temp = head;
    if (k > count(temp)) {
      System.out.println("Kth is greater then list size");
      return;
    }
    for (int i = 1; i < k; i++) {
      temp = temp.next;
    }
    System.out.println("kth Node :: " + temp.data);
  }

  // serach in list
  public static void search(Node head, int k) {
    Node temp = head;
    if (temp == null) {
      System.out.println("List is empty");
      return;
    }

    while (temp != null) {
      if (temp.data == k) {
        System.out.println("Node is present");
        return;
      }
      temp = temp.next;
    }

    System.out.println("Node is not present");
  }

  // insert Node
  public static void insertNode(Node head, int val, int pos) {
    Node temp = head;
    Node newNode = new Node(val);
    if (pos <= 1 ) {
      newNode.next = head;
      head = newNode;
      print(head);
      return;
    } else if (pos > count(temp) +1 ) {
      System.out.println("Out of Range");
      return;
    }

    for (int i = 1; i < pos-1; i++) {
      if (temp != null) {
        temp = temp.next;
      }
    }

    System.out.println(temp.data);
    newNode.next = temp.next;
    System.out.println(newNode.data);
    temp.next = newNode;
    print(head);

  }

  // delete Node
  public static void deleteNode(Node head,int pos){

        if(pos > count(head)){
            System.out.println("Out of range");
            return;
        }

        if(pos <= 1){
            head = head.next;
            print(head);
            return;
        }

        Node temp = head;
        for(int i=1;i<pos-1;i++){
            if(temp != null && temp.next != null){
                temp = temp.next;
            }
        }

        System.out.println(temp.data);
        temp.next = temp.next.next;
        print(head);


  }

  // reverseList
  public static Node reverseList(Node head){

        Node newHead = null;

        while(head != null){
            Node temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
        }

        return newHead;
  }

  public static Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
  }

  public static boolean palindrome(Node head){

        Node mid = findMid(head);
        System.out.println(mid.data);
        Node head2 = reverseList(mid);

        while(head != null && head2 != null){
            if(head.data != head2.data){
                return false;
            }

            head = head.next;
            head2 = head2.next;
        }

        return true;
  }

  public static void main(String[] agrs) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(20);
    Node n5 = new Node(10);
    // Node n6 = new Node(10);


    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    // n5.next = n6;

    Node temp = n1;

    System.out.println(palindrome(temp));

    
  }
}
