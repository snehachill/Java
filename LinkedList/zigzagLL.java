import java.util.LinkedList;

public class zigzagLL {
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

    public void Addlast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void Zigzag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt merge=zigzag list
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        zigzagLL ll = new zigzagLL();

        // Building linked list: 1 -> 2 -> 3 -> 4 -> 5
        ll.Addlast(1);
        ll.Addlast(2);
        ll.Addlast(3);
        ll.Addlast(4);
        ll.Addlast(5);

        System.out.print("Original List: ");
        ll.print();

        // Rearrange to Zigzag pattern
        ll.Zigzag();

        System.out.print("Zigzag List:   ");
        ll.print();
    }
}

