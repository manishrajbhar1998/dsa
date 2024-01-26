
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class MergeShort{

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findMid(Node head){

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node left,Node right){

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }

        Node ans = new Node(-1);
        Node temp = ans;

        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while(left != null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }

        while(right != null){
            temp.next = right;            
            temp = temp.next;
            right = right.next;
        }

        ans = ans.next;
        return ans;
    }



    public static Node mergeShort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }

        // break linklist into left half and right right half
        Node mid = findMid(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;

        //recursive call to short both half

        left = mergeShort(left);
        right = mergeShort(right);

        // merge both left and right
        Node result = merge(left,right);

        return result;





    }

    public static void main(String[] args){

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

        printList(n1);
        Node shortLinkList = mergeShort(n1);
        printList(shortLinkList);








        


    }
}