import java.util.ArrayList;

public class ContainerwithMostWater {
    public static int StoreWater(ArrayList<Integer>Height){
        int MaxWater=Integer.MIN_VALUE;
        for(int i=0;i<Height.size();i++){
            for(int j=i+1;j<Height.size();j++){
                  int Waterheight=Math.min(Height.get(i),Height.get(j));
                  int width=j-i;
                  int currWater=Waterheight*width;
                  MaxWater=Math.max(MaxWater, currWater);
            }
        }
        return MaxWater;
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
