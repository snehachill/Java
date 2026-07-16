public class RemoveFirst {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void Addfirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
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
     
    public int RemoveFirstNode(){
        int val=head.data;
        head=head.next;
        return val;
    }


    public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
    public static void main(String[] args) {
        RemoveFirst list=new RemoveFirst();
        list.Addfirst(10);
        list.Addlast(30);
        int removedValue = list.RemoveFirstNode();
        System.out.println("Removed value: " + removedValue);
        list.print();
        
        

        
    }
}
