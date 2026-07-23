public class ReverseDoublyLL {
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;

    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void Reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           curr.prev=next;

           prev=curr;
           curr=next;
        }
        head=prev;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        ReverseDoublyLL list=new ReverseDoublyLL();
        list.addfirst(3);
        list.addfirst(2);
        list.addfirst(1);

        list.print();
        list.Reverse();
        list.print();
    }

}
