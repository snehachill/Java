public class structure {
    static class Node {
        int data;
        Node next;
    Node(int data) {
            this.data = data;
            this.next = null;
    }
}
    public static void main(String[] args) {
      Node Node1= new Node(10);
      Node Node2= new Node(20);
      Node Node3= new Node(30);
      Node1.next=Node2;
      Node2.next=Node3;

      System.out.println(Node1.data);
      System.out.println(Node1.next.data);
      System.out.println(Node1.next.next.data);
    }
}
    