import java.util.*;

public class GenerateBinaryNo {
    public static void generatebinary(int n){
        Queue<String>q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
             String s1=q.peek();
             q.remove();
             System.out.println(s1);
             String s2=s1;
             q.add(s1+ "0");
             q.add(s2+ "1");
        }
    }
    public static void main(String[] args) {
        int n=5;
        generatebinary(n);
    }
}
