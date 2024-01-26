class ListNode {

  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}

class AddTwoNumber {

  public ListNode addTwoNumbers(ListNode A, ListNode B) {
    ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
    int carry = 0;

    while (A != null || B != null) {
      int x = (A != null) ? A.val : 0;
      int y = (B != null) ? B.val : 0;

      int sum = x + y + carry;
      carry = sum / 10;

      current.next = new ListNode(sum % 10);
      current = current.next;

      if (A != null) A = A.next;
      if (B != null) B = B.next;
    }

    if (carry > 0) {
      current.next = new ListNode(carry);
    }

    return dummyHead.next;
  }

  // Utility function to print the linked list
  public void printList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    AddTwoNumber solution = new AddTwoNumber();

    // Example 1
    ListNode A1 = new ListNode(2);
    A1.next = new ListNode(4);
    A1.next.next = new ListNode(3);

    ListNode B1 = new ListNode(5);
    B1.next = new ListNode(6);
    B1.next.next = new ListNode(4);

    ListNode result1 = solution.addTwoNumbers(A1, B1);
    System.out.println("Output 1:");
    solution.printList(result1);
    // Example 2
    // ListNode A2 = new ListNode(9);
    // A2.next = new ListNode(9);

    // ListNode B2 = new ListNode(1);

    // ListNode result2 = solution.addTwoNumbers(A2, B2);
    // System.out.println("Output 2:");
    // solution.printList(result2);
  }
}
