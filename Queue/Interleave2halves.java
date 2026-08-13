import java.util.LinkedList;
import java.util.Queue;

public class Interleave2halves {
    public static void interleave(Queue<Integer> q){
        int size=q.size();
        Queue<Integer>firsthalve=new LinkedList<>();

        for(int i=0;i<size/2;i++){
            firsthalve.add(q.remove());
        }
        while(!firsthalve.isEmpty()){
            q.add(firsthalve.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);
        //print
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
}
}
