// ...existing code...
public class DetectLoop {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public boolean detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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
        System.out.println();
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        // create a loop
        list.head.next.next.next = list.head;

        System.out.println("Cycle detected: " + list.detectCycle());
    }
}


