package linkedList;

public class middleNode {
	public static boolean deleteMiddleNode(linkedListNode node) {
		if (node == null | node.next == null)
			return false;
		
		linkedListNode nextNode = node.next;
		node.data = nextNode.data;
		node.next = nextNode.next;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		linkedList ll = new linkedList();
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		
		ll.display();
		
		deleteMiddleNode(ll.head.next.next);
		
		ll.display();
	}
}
