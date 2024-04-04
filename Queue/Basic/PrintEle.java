import java.util.*;

class PrintEle{

    public static void main(String[] agrs){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        Queue<Integer> q2 = new ArrayDeque<>();

       System.out.println(q);

       while(q.size() > 0){
            System.out.println(q.peek());
            q2.add(q.poll());
       }


       System.out.println(q);
       

       while(q2.size() > 0){
        q.add(q2.poll());
       }

       System.out.println(q);


    }
}