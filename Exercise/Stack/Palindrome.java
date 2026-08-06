//palindrome program
public class Palindrome {
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    //main
    Node slow = head;
    Node fast = head;
    public boolean isPalindrome() {
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    //reverse the second half of the linked list
    Node prev = null;
    Node curr = slow;
    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    //compare the first half and the reversed second half
    Node firstHalf = head;
    Node secondHalf = prev;
    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) {
            return false;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }
    return true;
}
public static void main(String[] args) {
    Palindrome list = new Palindrome();
    list.head = list.new Node('1');
    list.head.next = list.new Node('2');
    list.head.next.next = list.new Node('3');
    list.head.next.next.next = list.new Node('2');
    list.head.next.next.next.next = list.new Node('1');

    if (list.isPalindrome()) {
        System.out.println("The linked list is a palindrome.");
    } else {
        System.out.println("The linked list is not a palindrome.");
    }
}
}