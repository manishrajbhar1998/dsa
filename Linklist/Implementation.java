class Implementation {

  static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static class Linklist {

    Node head = null;
    Node tail = null;

    void insert(int n, int val) {
      Node newNode = new Node(val);

      Node temp = head;
      if (n == 0) {
        inserAtStart(val);
      } else if (n == size()) {
        insertAtEnd(val);
      } else if (n > size() || n < 0) {
        System.out.println("Size out of bounds");
      } else {
        for (int i = 0; i < n - 1; i++) {
          temp = temp.next;
        }

        System.out.println("insert " + temp.data);
        newNode.next = temp.next;
        temp.next = newNode;
      }
    }

    void insertAtEnd(int n) {
      Node temp = new Node(n);

      if (head == null && tail == null) {
        head = temp;
        tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
    }

    void inserAtStart(int n) {
      Node temp = new Node(n);
      if (head == null) {
        head = temp;
        tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }
    }

    void getElementAt(int n) {
      if (n >= size() || n < 0) {
        System.out.println("Index out of bounds");
      } else if (n == 0) {
        System.out.println(head.data);
      } else if (n == size() - 1) {
        System.out.println(tail.data);
      } else {
        Node temp = head;
        for (int i = 0; i < n; i++) {
          temp = temp.next;
        }
        System.out.println(temp.data);
      }
    }

    void deleteNode(int n) {
      Node temp = head;

      if (n >= size() || n < 0) {
        System.out.println("Index out of bounds");
      } else if (n == 0) {
        head = head.next;
      } else if (n == size() - 1) {
        for (int i = 0; i < n - 1; i++) {
          temp = temp.next;
          tail = temp;
        }
        temp.next = temp.next.next;
      } else {
        for (int i = 0; i < n - 1; i++) {
          temp = temp.next;
        }
        // System.out.println("current node :: " + temp.data);
        temp.next = temp.next.next;
      }
      // System.out.println("deleted " + temp.data);
    }

    int size() {
      int count = 0;

      Node temp = head;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }

    void printList() {
      Node temp = head;
      while (temp != null) {
        if (temp.next == null) {
          System.out.print(temp.data);
        } else {
          System.out.print(temp.data + "->");
        }
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Linklist ll = new Linklist();
    ll.insertAtEnd(1);
    ll.insertAtEnd(2);
    ll.insertAtEnd(3);
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);

    ll.inserAtStart(100);
    ll.inserAtStart(200);
    ll.inserAtStart(300);
    ll.inserAtStart(400);
    ll.printList();
    ll.insert(8, 1000);
    ll.printList();
    System.out.println(ll.head.data);
    System.out.println(ll.tail.data);
    // ll.getElementAt(9);
    // ll.deletedNode()
    // ll.printList();
    // ll.deleteNode(5);
    // ll.printList();
    // System.out.println(ll.head.data);
    // System.out.println(ll.tail.data);
  }
}
