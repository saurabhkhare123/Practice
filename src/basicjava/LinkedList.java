package basicjava;

import java.io.IOException;
import java.util.Scanner;

class LinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data= data;
            this.next = null;
        }
    }

    public void insertLast(int data){
        ListNode node = new ListNode(data);
        if(head==null){
            head=node;
            return;
        }
        ListNode curr = head;
        if(curr.next!=null){
            curr = curr.next;
        }
        curr.next=node;


    }

    public void insertFirst(int data){
        ListNode node = new ListNode(data);
        if(head==null){
            head=node;
            return;
        }
        ListNode temp=head;
        head=node;
        head.next=temp;
    }

    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;

    }

    public ListNode deleteLast(){
        if(head==null){
            return null;
        }
        ListNode temp= head;
        ListNode prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next= null;
        return temp;


    }

    public void display(){
        if(head==null){
            System.out.print("null");
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null ");
    }

    public void insert(int data,int position){
        ListNode node = new ListNode(data);
        if(position==1){
            node.next=head;
            head=node;
        }else{
            ListNode previous = head;
            int count=1;
            while(count < position-1){
                previous= previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=node;
            node.next = current;
        }
    }



    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        LinkedList sll = new LinkedList();


        sll.insert(9,1);
        sll.insertFirst(6);
        sll.insertLast(13);
        sll.insert(10,2);

        sll.display();





    }
}