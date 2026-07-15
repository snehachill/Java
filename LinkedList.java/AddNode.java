public class AddNode {
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

        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }


    public static void main(String[] args) {
        AddNode list=new AddNode();
        list.Addfirst(10);
        list.Addfirst(20);
        list.Addfirst(30); 
        
        list.print();
    }
}