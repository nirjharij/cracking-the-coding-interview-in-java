package linkedList;

public class test {
	public static void main(String[] args) {
		linkedList ll = new linkedList();
		ll.addNode(2);
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(1);
		ll.addNode(6);
		
		removeDups rDups = new removeDups();
		rDups.removeDuplicates(ll.head);
		
		ll.display();
	}
}
