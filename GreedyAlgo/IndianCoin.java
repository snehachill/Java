import java.util.*;
public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200};

        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=250;
        int count=0;
        List<Integer>ans=new ArrayList<>();
       
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                 count++;
                 ans.add(coins[i]);
                 amount=amount-coins[i];
            }
        }
    }
    System.out.println(count);
    for(int i=0;i<ans.size();i++){
       System.out.println(ans);
    }
    System.out.println();
}
}
