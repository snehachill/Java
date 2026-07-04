public class removeDuplicates {
 
    public static boolean[] map=new boolean[26];

    public static void removedup(String str,StringBuilder newstr,int i){
        //base class
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(i);
        int mapidx=currchar-'a';

        if(map[mapidx]==true){//if found true
           removedup(str, newstr, i+1);
        }
        else {map[mapidx]=true;
             newstr.append(currchar);
             removedup(str, newstr, i+1);
        }
    }
    public static void main(String[] args) {
        String str="apnnacollege";
        removedup(str, new StringBuilder(""), 0);
    }
}
