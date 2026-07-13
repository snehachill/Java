import java.util.ArrayList;
public class Pairsum2 {
    public static boolean pairsum(ArrayList<Integer>list,int target){
       int n=list.size();
       int bp=-1;
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i)<list.get(i+1)){
            bp=i;
            break;
        }
       }
       int lp=bp+1;//smallest
       int rp=bp;//greatest
       while(lp != rp){
        //case 1
          if(list.get(lp)+list.get(rp)==target){
            return true;
          }
          //case2
          if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;//modolus arithemtic
          }
          else{
            rp=(n+rp-1)%n;
          }
       }
       return false;
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(11);
       list.add(15);
       list.add(6);
       list.add(8);
       list.add(9);
       int target=26;
       
       System.out.println(pairsum(list, target));
}
}
