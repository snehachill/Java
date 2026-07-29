//Insert data in stack at the bottom
import java.util.*; 
public class AtBottom {
    public static void pushAtbottom(Stack<Integer>s,int data){
        //base class
        if(s.isEmpty()){
           s.push(data);
           return;
        }
        //main work
        int top=s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        pushAtbottom(s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    
}
