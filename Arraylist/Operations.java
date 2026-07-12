import java.util.ArrayList;

class Operations{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        //adding element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get element
        int element= list.get(2);
        System.out.println(element);

        //delete element
        list.remove(2);
        System.out.println(list);

        //set element
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }

}