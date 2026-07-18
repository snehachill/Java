public class FIndandRemove {
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
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int remove(int index) {
        if (head == null || index < 0 || index >= size) {
            return -1;
        }
        if (index == 0) {
            int removed = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return removed;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        int removed = curr.next.data;
        curr.next = curr.next.next;
        if (curr.next == null) {
            tail = curr;
        }
        size--;
        return removed;
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
        FIndandRemove list = new FIndandRemove();
        list.addFirst(30);
        list.addFirst(10);
        list.addFirst(20);
        list.print();
        int removedValue = list.remove(1);
        System.out.println("Removed value: " + removedValue);
        list.print();
    }
}
