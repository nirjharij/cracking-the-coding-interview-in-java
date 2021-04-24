package linkedList;

import linkedList.linkedList.linkedListNode;

public class kthToLast {
	static int kthFromLast(linkedListNode head, int k) {
		linkedListNode ahead = head;
		linkedListNode current = head;
		
		for (int i=0; i<k-1; i++) {
			if (ahead != null)
				ahead = ahead.next;
		}
		
		while(ahead.next != null) {
			current = current.next;
			ahead = ahead.next;
		}
		
		return current.data;
	}
	
	public static void main(String[] args) {
		linkedList ll = new linkedList();
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(6);
		
		System.out.println(kthFromLast(ll.head, 3));
	}
}
