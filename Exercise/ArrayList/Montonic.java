import java.util.ArrayList;

public class Montonic{
    public static boolean montonic(ArrayList<Integer>list){
       boolean IsIncrease=true;
       boolean IsDecrease=true;

       for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                IsIncrease=false;
            }
            if(list.get(i)<list.get(i+1)){
                IsDecrease=false;
            }
       }
       return IsIncrease || IsDecrease;
       }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(montonic(list));
    }
}