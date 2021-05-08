package stacksAndQueues;


public class queueViaStacks {
	static stack s1 = new stack(10);
	static stack s2 = new stack(10);
	
	public static boolean push(int data) {
		if (s1.isEmpty()) {
			if (s2.isEmpty()) {
				s1.push(data);
				return true;
			}
			else {
				while (!s2.isEmpty()) {
					int item = s2.pop();
					s1.push(item);
				}
				s1.push(data);
				return true;
			}
		}
		else {
			s1.push(data);
			return true;
		}
	}
	
	public static int poll() {
		if (s1.isEmpty()) {
			if (s2.isEmpty())
				return -1;
			else {
				return s2.pop();
			}
		}
		else {
			while (!s1.isEmpty()) {
				int item = s1.pop();
				s2.push(item);
			}
			return s2.pop();
		}
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(poll());
		System.out.println(poll());
		push(4);
		System.out.println(poll());
	}
}
