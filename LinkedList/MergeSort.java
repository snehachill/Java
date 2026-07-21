public class MergeSort {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // 1. Helper Function: Find Mid Node (Fast = head.next for proper split)
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // fast.next se left half thoda chhota ya barabar banta hai

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 2. Helper Function: Merge Two Sorted Lists
    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1); // Dummy node
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Remaining elements (if any)
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }

        return mergeLL.next;
    }

    // 3. Main MergeSort Function
    public Node mergesort(Node head) {
        // Base Case: 0 or 1 element
        if (head == null || head.next == null) {
            return head;
        }

        // Step A: Find Mid
        Node mid = getMid(head);

        // Step B: Break Into Two Halves
        Node rightHead = mid.next;
        mid.next = null; // Cut the connection!

        // Step C: Recursive Calls
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        // Step D: Merge Both Halves
        return merge(newLeft, newRight);
    }

    // Helper method to print list
    public void print(Node head) {
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
        MergeSort list = new MergeSort();
        
        // Unsorted Train: 40 -> 10 -> 30 -> 20
        list.head = new Node(40);
        list.head.next = new Node(10);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(20);

        System.out.print("Original List: ");
        list.print(list.head);

        // Run MergeSort
        list.head = list.mergesort(list.head);

        System.out.print("Sorted List:   ");
        list.print(list.head);
    }
}
