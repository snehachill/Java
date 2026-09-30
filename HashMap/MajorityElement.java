import java.util.*;
public class MajorityElement{
    public static void main(String args[]){
        int arr[]={1,1,2,3,3,2,1,1,4,5};
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Integer key:map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println("Majority Element: " + key);
            }
        }
    }
}
