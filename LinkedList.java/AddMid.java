public class AddMid {
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

    public void Addfirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void Addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void AddMidNode(int idx,int data){
        if(idx==0){
            Addfirst(data);
            return;
        }
       Node newNode = new Node(data);
       Node temp=head;
       int i=0;

       while(i<idx-1){
        temp=temp.next;
        i++;
       }

       newNode.next=temp.next;
       temp.next=newNode;
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
        AddMid list=new AddMid();
        list.Addfirst(10);
        list.Addfirst(20);
        list.Addlast(30);
        list.Addlast(40);
        list.AddMidNode(2,25);
        list.print();  

        
    }
}
