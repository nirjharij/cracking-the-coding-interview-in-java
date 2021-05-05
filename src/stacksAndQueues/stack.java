package stacksAndQueues;


public class stack {
	private int thresholdCapacity;
	int top = 0;
	int bottom = 0;
	
	private int[] stackArr;
	int size = 0;
	
	public stack(int thresholdCapacity) {
		this.thresholdCapacity = thresholdCapacity;
		stackArr = new int[thresholdCapacity];
	}
	
	public boolean push(int data) {
		if (size < thresholdCapacity) {
			stackArr[size++] = data;
			top = size;
			return true;
		}
		return false;
	}
	
	public int pop() {
		if (size != 0) {
			int item = stackArr[--size];
			top = size;
			return item;
		}
		return -1;
	}
	
	public int pop_bottom() {
		return stackArr[bottom];
	}
}
