public class IterativeSearch {
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

        public int iterative(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                i++;
                temp=temp.next;
            }
            return -1;
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
        IterativeSearch list=new IterativeSearch();
        list.Addfirst(10);
        list.Addfirst(20);
        list.Addfirst(30);
        
        list.print();
        System.out.println(list.iterative(20));
    }
}

