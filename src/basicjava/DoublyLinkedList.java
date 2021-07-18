package basicjava;

public class DoublyLinkedList {
    private Node head;
    private static  class Node{
        private int data;
        private Node prev;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }

    //Adding a node at first
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            head= node;
            return;
        }
        head.prev = node;
        node.next=head;
        head = node;

    }

    public void InsertAfter(Node prev_Node, int data){
        Node node = new Node(data);
        if(prev_Node==null){
            System.out.println("The given previous node cant be null");
            return;
        }

        node.next=prev_Node.next;
        prev_Node.next=  node;
        node.prev = prev_Node;
        if(node.next!=null){
            node.next.prev = node;
        }


    }

    //Add a node at the end
    public void end(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        node.prev=temp;

    }

    //display
    public void display(){
        if(head==null){
            System.out.println("null");
        }
        //traversal in forward direction
        Node temp=head;
        Node last = null;

        while(temp!=null){
            System.out.print(temp.data + " ");
            last = temp;
            temp=temp.next;
        }
        //reversal direction
        System.out.println();
        while(last!=null){
            System.out.println(last.data + " ");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
       DoublyLinkedList m= new DoublyLinkedList();
        m.end(1);

        m.display();
    }
}
