// Source: Geeks for Geeks

package linkedList;

public class linkedList{
	class linkedListNode {
		int data;
		linkedListNode next;
		
		public linkedListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public linkedListNode head = null;    
    public linkedListNode tail = null;    
    
    public void addNode(int data) {    
        //Create a new node    
    	linkedListNode newNode = new linkedListNode(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
    
    public void display() {    
        // Node current will point to head    
    	linkedListNode current = head;    
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            // Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
}

