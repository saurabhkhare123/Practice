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

        sll.display();
        int m = sll.length();
        System.out.println("length of singly linked list is " + m);

    }


}
