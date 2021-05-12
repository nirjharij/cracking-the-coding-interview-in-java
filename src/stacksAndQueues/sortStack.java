package stacksAndQueues;

public class sortStack {
	
	public static void sortingStack(stack s1) {
		stack s2 = new stack(10);
		
		while (!s1.isEmpty()) {
			int current_element = s1.pop();
			
			if (s2.isEmpty())
				s2.push(current_element);
			else {
				int top_element = s2.peek();
				if (top_element > current_element) {
					while (!s2.isEmpty() && s2.peek() > current_element) {
						int temp = s2.pop();
						s1.push(temp);
					}
					s2.push(current_element);
				}
				else {
					s2.push(current_element);
				}
			}
		}
		
		while(!s2.isEmpty()) {
			System.out.println(s2.pop());
		}
	}
	
	public static void main(String[] args) {
		stack s1 = new stack(10);
		s1.push(4);
		s1.push(1);
		s1.push(3);
		s1.push(2);
		
		sortingStack(s1);
	}
	
}
