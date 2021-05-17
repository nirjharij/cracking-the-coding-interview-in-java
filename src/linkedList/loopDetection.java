// Assumptions:
// 1. A loop exists in a linked list
// 2. Linked list is not null

package linkedList;

public class loopDetection {
	public static void detectLoop(linkedListNode head) {
		linkedListNode slowPointer = head;
		linkedListNode fastPointer = head;
		
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer)
				break;
		}
		
		slowPointer = head;
		
		while(slowPointer != fastPointer) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		System.out.println(fastPointer.data);
	}
	
	public static void main(String[] args) {
		linkedList linkedList = new linkedList();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(7);
		linkedList.tail.next = linkedList.head.next.next;
		
		detectLoop(linkedList.head);
	}
}
