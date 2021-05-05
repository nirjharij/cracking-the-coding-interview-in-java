package stacksAndQueues;

import java.util.ArrayList;


public class stackOfPlates {
	
	static ArrayList<stack> stacks = new ArrayList<stack>();
	
	static int thresholdCapacity = 5;
	
	public static void push(int data) {
		stack currentStack = getStack();
		if (currentStack != null && currentStack.size < thresholdCapacity)
			currentStack.push(data);
		else {
			stack s = new stack(thresholdCapacity);
			s.push(data);
			stacks.add(s);
		}
	}
	
	static int pop() {
		stack currentStack = getStack();
		if (currentStack == null)
			return -1;
		int data = currentStack.pop();
		if (currentStack.size == 0)
			stacks.remove(stacks.size() - 1);
		return data;
	}
	
	static stack getStack() {
		if (stacks.size() == 0) {
			return null;
		}
		return stacks.get(stacks.size() - 1);
	}
	
	static int popAt(int index) {
		stack s1 = stacks.get(index);
		int popped = s1.pop();
		index += 1;
		while (index < stacks.size()) {
			stack s2 = stacks.get(index);
			int bottom = s2.pop_bottom();
			s1.push(bottom);
			s1 = s2;
			index += 1;
		}
		return popped;
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		push(7);
		push(8);
		push(9);
//		System.out.println(pop());
//		System.out.println(pop());
		System.out.println(popAt(0));
		System.out.println(popAt(1));
	}
}
