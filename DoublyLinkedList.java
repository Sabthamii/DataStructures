package day_4;

class DoublyLinkedList {
   
    static class Node {
        int data;
        Node prev, next;

        
        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    Node head;  

   
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

   
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

  
    public DoublyLinkedList clone() {
        DoublyLinkedList clonedList = new DoublyLinkedList();
        Node current = head;

        
        while (current != null) {
            clonedList.append(current.data);
            current = current.next;
        }
        
        return clonedList;
    }

    
    public DoublyLinkedList deepClone() {
        DoublyLinkedList newList = new DoublyLinkedList();
        Node current = head;
        Node last = null;

       
        while (current != null) {
            Node newNode = new Node(current.data);
            if (last == null) {
                newList.head = newNode;  
            } else {
                last.next = newNode;
                newNode.prev = last;
            }
            last = newNode;
            current = current.next;
        }
        return newList;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original list:");
        list.printList();

       
        DoublyLinkedList clonedList = list.deepClone();

        System.out.println("Cloned list:");
        clonedList.printList();
    }
}
