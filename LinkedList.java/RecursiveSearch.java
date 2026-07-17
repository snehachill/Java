public class RecursiveSearch {
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

        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }

            int subIdx=helper(head, key);

            if(subIdx==-1){
                return -1;
            }

            return subIdx+1;
            
        }

        public int recursiveSearch(int key){
           return  helper(head, key);
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
        RecursiveSearch list=new RecursiveSearch();
        list.Addfirst(10);
        list.Addfirst(20);
        list.Addfirst(30);
        
        list.print();
        System.out.println(list.recursiveSearch(30));
    }
}

