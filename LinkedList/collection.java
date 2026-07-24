import java.util.LinkedList;
public class collection{
    public static void main(String[] args) {
        //create
        LinkedList<Integer>list=new LinkedList<>();
        //add
        list.addLast(3);
        list.addLast(4);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);

        //remove
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}