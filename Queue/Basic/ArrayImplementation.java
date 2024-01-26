class ArrayImplementation{

    static class Queue{

        int[] arr = new int[5];
        int f = -1;
        int r = -1;
        int size = 0;

        public void add(int val){
            if(r == arr.length-1){
                System.out.println("Queue is full");
            }

            if(f == -1 || size == 0){
                f = r = 0;
                arr[0] = val;
            }else{
                arr[++r] = val;
            }
            size++;
        }

        public int poll(){
            if(size == 0){
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            if(size == 0){
                return -1;
            }
            return arr[f];
        }

        public int size(){
            return size;
        }

        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }

            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] agrs){

        Queue q = new Queue();
        System.out.println(q.size());
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.size());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.size());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.size());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.size());
        q.add(40);
        q.add(40);
        q.display();








    }
}