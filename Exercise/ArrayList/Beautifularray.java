import java.util.ArrayList;

public class Beautifularray {
    public static ArrayList<Integer> beautifulArray(int n) {
       ArrayList<Integer> ans=new ArrayList<>();
       ans.add(1);

       while(ans.size()<n){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            int x=ans.get(i);
            temp.add(2*x-1);//odd
        }
        for(int i=0;i<ans.size();i++){
            int x=ans.get(i);
            temp.add(2*x); //even
        }
        ans=temp;
       }

       ArrayList<Integer>result=new ArrayList<>();

       for(int i=0;i<ans.size();i++){
        int x=ans.get(i);
        if(x<=n){
            result.add(x);
        }
       }
       return result;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(beautifulArray(n));
    }
}
