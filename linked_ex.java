package day2_3;



public class linked_ex {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    public linked_ex() {
        head = null;
    }  
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        }
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    } 
    public void insertAtAnyPos(int pos, int val) {
        Node newNode = new Node(val);  
        Node temp = head;       
        for (int i = 1; i < pos - 1; i++) {
            
            temp = temp.next;
        }        
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBegin() {
    	head=head.next;
    }
    public void deleteAtAnyPos(int dpos) {
    	Node temp=head;
    	Node dtemp=null;
    	for(int i=0;i<dpos-1;i++) {
    		dtemp=temp;
    		temp=temp.next;
    		 }
    	dtemp.next=temp.next;
    }
}