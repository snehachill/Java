import java.util.*;
public class Duplicateparentheses {
    public static boolean IsDuplicate(String str){
        Stack<Character>s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //closing bracket case
            if (ch == ')') {
                 if (s.peek() == '(') {
                      return true;
                 }
                 else{
                    while(s.peek()!='('){
                        s.pop();
                    }
                    s.pop();
                 }
            }
            else{
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String args[]){
        String str="((a+b))";//true
        String str1="(a+b)";//false;

        System.out.println(IsDuplicate(str));
        System.out.println(IsDuplicate(str1));
    }
}
