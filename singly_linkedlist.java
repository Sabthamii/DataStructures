package day2_3;

public class singly_linkedlist {

	public static void main(String args[]) {
		linked_ex l=new linked_ex();
		l.insertAtBegin(60);
		l.insertAtBegin(50);
		l.insertAtBegin(40);
		l.insertAtBegin(30);
		l.insertAtBegin(20);
		l.insertAtBegin(10);
		l.insertAtAnyPos(4, 45);
		l.insertAtAnyPos(5, 33);
		l.insertAtBegin(777);
		l.insertAtAnyPos(4, 333);
		l.display();
		l.deleteAtBegin();
		l.deleteAtAnyPos(2);
		
		l.display();
	}
	
	
}
