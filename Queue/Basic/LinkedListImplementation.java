


class LinkedListImplementation{

    public static class Node{

        int val;
        Node  next;

        Node(int val){
            this.val = val;
        }

    }

    public static class Queue{

        Node head;
        Node tail;
        int size = 0;

        public void add(int val){

            Node temp = new Node(val);

            if(size == 0){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = tail.next;
            }

            size++;
        }

        public int poll(){

            if(head == null){
                return -1;
            }

            int ref = head.val;
            head = head.next;
            size--;
            return ref;
        }

        public void display(){

            Node temp = head;

            if(temp == null){
                System.out.println("Queue is Empty");
            }

            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] agrs){

        Queue q = new Queue();

        System.out.println(q.size);
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.size);
        q.display();
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.size);
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.size);
        q.display();
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());


        


    }


}