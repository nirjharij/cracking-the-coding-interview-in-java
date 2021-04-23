package linkedList;

public class removeDups {
	public void removeDuplicates(linkedList.linkedListNode head) {
		linkedList.linkedListNode current = head;
		while (current != null) {
			linkedList.linkedListNode othernode = current;
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
