import java.util.*;

public class CircularQueue {
    static class clsQueue {
        int[] Arr;
        int size;
        int rear;
        int front;

        clsQueue(int n) {
            Arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }

        public boolean isEmpty() {
            return rear == -1 && front==-1;
        }
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add (Enqueue) - O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear = (rear + 1) % size;
            Arr[rear] = data;
        }

        // Remove (Dequeue) - O(1)
        public int delete() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = Arr[front];
            if (front == rear) {
                front=rear=-1;
            }
            else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return Arr[front];
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