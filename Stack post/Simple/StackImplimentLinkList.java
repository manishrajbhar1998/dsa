class StackImplimentLinkList{

    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack{

        Node head = null;
        int size = 0;

        void push(int val){

            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){

            if(head == null){
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            return head.val;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRe(Node head){

            if(head == null){
                return;
            }

            displayRe(head.next);
            System.out.print(head.val+" ");
        }

        void displayReverse(){
            Node temp = head;
            displayRe(temp);
            System.out.println();
        }

        int size(){
            return size;
        }
    }

    public static void main(String[] args){
        LLStack st = new LLStack();
        System.out.println(st.size());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        st.displayReverse();
        System.out.println(st.size());



        
    }
}