import java.util.*;

public class QueueA {
    static class clsQueue {
        int[] Arr;
        int size;
        int rear;

        clsQueue(int n) {
            Arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Add (Enqueue) - O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            Arr[rear] = data;
        }

        // Remove (Dequeue) - O(N) due to left shift
        public int delete() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = Arr[0];
            
            // Shift elements left by 1 position
            for (int i = 0; i < rear; i++) {
                Arr[i] = Arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return Arr[0];
        }
    }

    public static void main(String[] args) {
        clsQueue q = new clsQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.delete();
        }
    }
}
