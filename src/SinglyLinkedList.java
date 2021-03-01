public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;    //generic type
        private ListNode next;
        public  ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }
//to display the singly the linked list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    //to find the length of singly linked list
    public int length(){
        if(head==null){
            return 0;}
        int count = 0;
        ListNode current = head;
        while (current!=null){

           count++;
           current= current.next;

        }
        return count;
    }

    //to insert data at the beginning of a Singly Linked List
    public  void insertFirst(int value){
        ListNode newNode = new ListNode(value); //creating new object that you wanna make the head
        newNode.next = head; // connecting the new node to the list
        head = newNode; //making that new node the head of the list

    }

    //to insert the node at the end of the list
    public  void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head = newNode;
            return;

        }
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;

    }

    //to delete the first node
    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //to delete the Last Node
    public ListNode deleteLast(){
        if(head==null || head.next== null ){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!= null){
            previous = current;
            current = current.next;

        }
        previous.next = null;
        return current;
    }




    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        //head is instance variable
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // now connecting nodes
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.insertFirst(11);
        sll.insertLast(12);
        ListNode temp = sll.deleteFirst();
        ListNode temp1 = sll.deleteLast();
        System.out.println(temp);
        System.out.println(temp1);


        sll.display();
        int m = sll.length();
        System.out.println("length of singly linked list is " + m);


    }


}
