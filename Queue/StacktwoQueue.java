import java.util.*;
public class StacktwoQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public  static boolean isEmpty(){
            return q1.isEmpty();
        }

        public static void push(int data){
             q2.add(data);
             while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            Queue<Integer>temp=q1;
            q1=q2;
            q2=temp;
        }
        public static int pop(){
            while(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.remove();
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        s.push(4);

        System.out.println("Remaining elements LIFO order:");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}


