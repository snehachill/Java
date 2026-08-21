import java.util.*;
public class MaxLengthChain {
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};
        int n = pairs.length;
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen=1;
        int lastEnd = pairs[0][1];
        for(int i=0;i<n;i++){
            if(pairs[i][0]>lastEnd){
                chainLen++;
                lastEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum Length of Chain: " + chainLen);
    }
}