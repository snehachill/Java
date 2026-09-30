import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 90);
        lhm.put("America", 60);
        lhm.put("china", 20);

        System.out.println(lhm); // sequential output
    }
}
