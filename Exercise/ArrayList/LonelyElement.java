import java.util.ArrayList;
import java.util.Collections;


public class LonelyElement {
    public ArrayList<Integer> FindLonely(ArrayList<Integer>nums) {
        Collections.sort(nums);//o(nlogn)
        ArrayList<Integer>list=new ArrayList<>();
        int n=nums.size();

        if(n==1){//if n size is 1 i.e 1 element in array
          list.add(nums.get(0));
          return list;
        }

        for(int i=0;i<n;i++){
            int current=nums.get(i);
            if(i>0 && (nums.get(i-1)==current || nums.get(i-1)==current-1)){
               continue;
            }
            if(i<n-1 && (nums.get(i+1)==current || nums.get(i+1)==current+1)){
                continue;
            }
            list.add(current);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(4);
        System.out.println(new LonelyElement().FindLonely(nums));
    }
}
