import java.util.*;

public class ActivitySelection2 {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] finish = {4, 2, 9, 6, 7, 9};//unsorted finish time

        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = finish[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int Max=0;
        ArrayList<Integer>ans=new ArrayList<>();
        Max=1;
        ans.add(activities[0][0]);
        int LastEnd=activities[0][2];
    
        for(int i=0;i<activities.length;i++){
            if(activities[i][1]>=LastEnd){
                Max++;
                ans.add(activities[i][0]);
                LastEnd=activities[i][2];
            }
        }
        System.out.println("Maximum activities that can be selected: " + Max);
        System.out.println("Selected activities: " + ans);

    }
}
