import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
       
        int Max=0;
        ArrayList<Integer>ans=new ArrayList<>();

        Max=1;
        ans.add(0);
        int LastEnd=finish[0];

        // Loop through the activities to select the maximum number of non-overlapping activities
        for(int i=0;i<finish.length;i++){
            if(start[i]>=LastEnd){
                Max++;
                ans.add(i);
                LastEnd=finish[i];
            }
        }
        System.out.println("Max Activities: "+ Max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        
    }
} 