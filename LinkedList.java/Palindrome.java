public class Palindrome{
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

    public void Addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node midNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;
    }

    public boolean Ispalindrome(){
        if(head==null && head.next!=null){
            return true;
        }
        //step 1:find MidNode
        Node midNode=midNode(head);

        //step2:reverse second half(right)
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step3:
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;   
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
        Palindrome list = new Palindrome();
        list.Addlast(1);
        list.Addlast(2);
        list.Addlast(1);
        list.print();
        System.out.println(list.Ispalindrome());
    }
}