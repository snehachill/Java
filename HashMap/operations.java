import java.util.HashMap;

public class operations{
    public static void main(String[] args){
        //create
        HashMap<String, Integer> map = new HashMap<>();

        //insert 
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        //display
        System.out.println(map);

        //get
        int value = map.get("B");
        System.out.println("Value for key B: " + value);

        //containsKey
        System.out.println(map.containsKey("A"));//true
        System.out.println(map.containsKey("D"));//false

        //remove
        System.out.println(map.remove("C"));
    }
}