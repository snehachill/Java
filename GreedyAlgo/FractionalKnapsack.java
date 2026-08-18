import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int values[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int W = 50;

        double[][] ratio= new double[values.length][2];
        for(int i=0;i<values.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=values[i]/(double)weights[i];
        }
        //ascending order of ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity=W;
        int finalValue=0;
        for(int i=ratio.length-1;i>=0;i--){
           int idx=(int)ratio[i][0];
           if(weights[idx]<=capacity){
              finalValue+=values[idx];
              capacity-=weights[idx];
           }else{
              finalValue+=ratio[i][1]*capacity;
              capacity=0;
              break;
           } 
    }
    System.out.println("Maximum value in Fractional Knapsack: " + finalValue);
}
}