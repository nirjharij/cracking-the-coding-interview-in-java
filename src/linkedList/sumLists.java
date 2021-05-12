package linkedList;

public class sumLists {
	public static void addLists(linkedListNode head1, linkedListNode head2) {
		int carry = 0;
		
		linkedList sumList = new linkedList();
		
		while ((head1 != null) && (head2 != null)) {
			int nodeSum = head1.data + head2.data + carry;
			
			if (nodeSum >= 10) {
				int sum = nodeSum%10;
				sumList.addNode(sum);
				carry = 1;
			}
			else {
				carry = 0;
				sumList.addNode(nodeSum);
			}
			
			
			head1 = head1.next;
			head2 = head2.next;
		}
		
		while (head1 != null) {
			int nodeSum = head1.data + carry;
			if (nodeSum >= 10) {
				int sum = nodeSum%10;
				sumList.addNode(sum);
				carry = 1;
			}
			else {
				carry = 0;
				sumList.addNode(nodeSum);
			}
			head1 = head1.next;
			
		}
		
		while (head2 != null) {
			int nodeSum = head2.data + carry;
			if (nodeSum >= 10) {
				int sum = nodeSum%10;
				sumList.addNode(sum);
				carry = 1;
			}
			else {
				carry = 0;
				sumList.addNode(nodeSum);
			}
			head2 = head2.next;
		}
		
		if (carry != 0)
			sumList.addNode(carry);
		
		sumList.display();
		
	}
	
	public static void main(String[] args) {
		linkedList linkedList1 = new linkedList();
		linkedList1.addNode(7);
		linkedList1.addNode(1);
		linkedList1.addNode(6);
		
		
		linkedList linkedList2 = new linkedList();
		linkedList2.addNode(5);
		linkedList2.addNode(9);
		linkedList2.addNode(3);
		linkedList2.addNode(5);
		
		addLists(linkedList1.head, linkedList2.head);
	}
}
