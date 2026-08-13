import java.util.ArrayDeque;
import java.util.*;

public class QueueusingDeque {
    static class Queue{
       ArrayDeque<Integer>dq=new ArrayDeque<>();

       public void add(int data){
        dq.addLast(data);
       }
       public int remove(){
        return dq.removeFirst();
       }
       public int get(){
         return dq.getFirst();
       }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.dq.isEmpty()){
            System.out.println(q.get());
            q.remove();
        }

    }
}
