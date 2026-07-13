import java.util.ArrayList;
public class PairSum {
    public static void onepair(ArrayList<Integer>list,int target){
        //Brute force approach
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+ list.get(j) == target){
                   System.out.print(list.get(i) + ", " + list.get(j)); 
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int target=4;
        onepair(list, target);
    }
}
