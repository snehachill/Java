import java.util.ArrayList;

public class ContainerWater {
    public static int StoreWater(ArrayList<Integer>Height){
        //Two-pointer approach
           int maxWater=0;
           int leftline=0;
           int rightline=Height.size()-1;
           while(leftline<rightline){
               int ht=Math.min(Height.get(leftline),Height.get(rightline));
               int width=rightline-leftline;
               int currWater=ht*width;
               maxWater=Math.max(maxWater, currWater);
               if(Height.get(leftline)<Height.get(rightline)){
                   leftline++;
               }
               else{
                rightline--;
               }
           }
           return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        
        System.out.println(StoreWater(Height));
    }
}
