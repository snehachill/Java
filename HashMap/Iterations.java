import java.util.*;

public class Iterations {
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 900);
        hm.put("China", 800);
        hm.put("Nepal", 700);
        hm.put("indonesia", 600);

        //iterations
        Set<String>keys=hm.keySet();
        for (String k : keys) {
            System.out.println("keys=" + k + " Values= " + hm.get(k));
        }

    }
}
