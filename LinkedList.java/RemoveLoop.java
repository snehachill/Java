public class RemoveLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void RemoveCycle() {
        // 1. Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // 2. Find start of loop
        fast = head;
        
        if (slow == fast) {
            while (slow.next != head) { 
                slow = slow.next;
            }
            slow.next = null; 
            return;
        }

        // 3. General Case: Cycle is somewhere in the middle
        Node prev = null; 
        while (slow != fast) {
            prev = slow;      
            slow = slow.next; 
            fast = fast.next; 
        }

        prev.next = null;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println("->null");
    }

    public static void main(String[] args) {
        RemoveLoop list = new RemoveLoop();
        list.head = new Node(20);
        list.head.next = new Node(30);
        list.head.next.next = new Node(40);
        list.head.next.next.next = list.head; // Creating loop back to 20

        list.RemoveCycle();
        System.out.println("printed list:");
        list.print();
    }
}


