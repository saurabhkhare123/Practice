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

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // now connecting nodes
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

    }


}
