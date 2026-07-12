import java.util.*;


public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);

        //ascending
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Ascending order : " +list);

        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order : " + list);
    }
}
