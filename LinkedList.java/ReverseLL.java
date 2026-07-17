public class ReverseLL {
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

        public void Reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node Next;

            while(curr!=null){
                Next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=Next;
            }
            head=prev;
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
            ReverseLL list=new ReverseLL();
            list.Addfirst(10);
            list.Addfirst(20);
            list.print();
            list.Reverse();
            
        }
}
