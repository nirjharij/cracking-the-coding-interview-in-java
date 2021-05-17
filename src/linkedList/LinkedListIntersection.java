// Assumptions:
// 1. Length of linked list is known

package linkedList;


public class LinkedListIntersection {
	public static void findIntersection(linkedListNode head1, int l1, linkedListNode head2, int l2) {
		int diff;
		boolean list1 = false;
		if (l1 > l2) {
			list1 = true;
			diff = l1 - l2;
		}
		else {
			diff = l2 - l1;
		}
		
		if (list1){
			while (diff != 0) {
				head1 = head1.next;
				diff-- ;
			}
		}
		else {
			while (diff != 0) {
				head2 = head2.next;
				diff-- ;
			}
		}
		
		boolean found = false;
		while (head1 != null && head2 != null) {
			if (head1 == head2) {
				found = true;
				break;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		if (found)
			System.out.println("Intersection found at:" + head1.data);
		else {
			System.out.println("Intersection not found at");
		}
	}
	
	public static void main(String[] args) {
		linkedList list = new linkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		
		linkedList list2 = new linkedList();
		list2.addNode(8);
		list2.addNode(9);
		list2.tail.next = list.head.next.next.next.next.next;
		list2.tail = list.head.next.next.next.next.next;
		list2.tail.next = list.head.next.next.next.next.next.next;
		list2.tail = list.head.next.next.next.next.next.next;
		
		findIntersection(list.head, 7, list2.head, 4);
	}
}
