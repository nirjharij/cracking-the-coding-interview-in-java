package linkedList;


public class partition {
	public static void partitionList(linkedListNode head, int partition) {
		
		linkedListNode leftPointer = null;
		linkedListNode rightPointer = null;
		linkedListNode mainPointer = head;
		
		while (mainPointer != null) {
			if (mainPointer.data < partition) {
				if (leftPointer != null) {
					int temp = leftPointer.next.data;
					leftPointer.next.data = mainPointer.data;
					mainPointer.data = temp;
					leftPointer = leftPointer.next;
				}
				else {
					leftPointer = mainPointer;
				}
			}
			else {
				if (rightPointer != null) {
					int temp = rightPointer.next.data;
					rightPointer.next.data = mainPointer.data;
					mainPointer.data = temp;
					rightPointer = rightPointer.next;
				}
				else {
					rightPointer = mainPointer;
				}
			}
			mainPointer = mainPointer.next;
		}
	}
	
	public static void main(String[] args) {
		linkedList ll = new linkedList();
		ll.addNode(3);
		ll.addNode(5);
		ll.addNode(8);
		ll.addNode(5);
		ll.addNode(10);
		ll.addNode(2);
		ll.addNode(1);
		
		partitionList(ll.head, 5);
		
		ll.display();
	}
}
