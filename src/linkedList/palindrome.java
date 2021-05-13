package linkedList;


public class palindrome {
	static class Result{
		boolean res;
		linkedListNode node;
		
		public Result(boolean res, linkedListNode node) {
			this.res = res;
			this.node = node;
		}
	}
	
	public static Result isPalindrome(linkedListNode head, int n) {
		if (n == 0 || head == null) {
			return new Result(true, head);
		}else if (n == 1) {
			return new Result(true, head.next);
		}
		
		Result temp = isPalindrome(head.next, n-2);
		if (!temp.res || temp.node == null)
			return temp;
		
		temp.res = (head.data == temp.node.data);
		temp.node = temp.node.next;
		return temp;
	}
	
	public static void main(String[] args) {
		linkedList linkedList = new linkedList();
		linkedList.addNode(1);
		linkedList.addNode(2);
		linkedList.addNode(2);
		linkedList.addNode(2);
		linkedList.addNode(1);
		
		Result finalResult = isPalindrome(linkedList.head, 5);
		System.out.println(finalResult.res);
	}
}
