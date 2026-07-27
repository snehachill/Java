import java.util.*;
public class ReverseStack {
    //pushAtBottom
    public static void PushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    //reverseStack
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        PushAtBottom(s, top);
    }

    //printStack
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    //main function
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

       reverseStack(s);
       printStack(s);
        

    }
}
