import java.util.ArrayList;

public class basic {
    // Custom Stack implementation using ArrayList
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data); // Adds to the end (top of stack)
        }

        public static int pop() {
            if (isEmpty()) {
                return -1; // Guard against empty stack
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1); // Removes top element
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1; // Guard against empty stack
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Look at top
            s.pop();                     // Remove top
        }
    }
}
