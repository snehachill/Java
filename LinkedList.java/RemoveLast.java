public class RemoveLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   public int RemoveLastNode(){
    if(size==0){
        System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int val=tail.data;
        tail=temp;
        tail.next=null;
        size--;
        return val;
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
        RemoveLast list = new RemoveLast();
        list.Addfirst(10);
        list.Addlast(30);
        int removedValue = list.RemoveLastNode();
        System.out.println("Removed value: " + removedValue);
        list.print();

    }
}
