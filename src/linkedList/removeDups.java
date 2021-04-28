package linkedList;

public class removeDups {
	public void removeDuplicates(linkedListNode head) {
		linkedListNode current = head;
		while (current != null) {
			linkedListNode othernode = current;
			while(othernode.next != null) {
				if (othernode.next.data == current.data) {
					othernode.next = othernode.next.next;
				}
				else {
					othernode = othernode.next;
				}
			}
			
			current = current.next;
		}
		
	}
}
