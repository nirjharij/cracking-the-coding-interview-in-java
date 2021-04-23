package stacksAndQueues;

import java.util.EmptyStackException;

public class threeInOne {
	private int numberOfStacks = 3;
	private int stackSize;
	private int[] array;
	private int[] topIndexes;
	
	public threeInOne(int stackSize) {
		this.stackSize = stackSize;
		array = new int[stackSize * numberOfStacks];
		topIndexes = new int[numberOfStacks];
	}
	
	public void push(int stackNum, int value){
		if (isFull(stackNum)) {
			System.out.println("Capacity Full, could not insert value " + value);
			throw new StackOverflowError();
		}
		int topIndex = getTopIndex(stackNum);
		array[++topIndex] = value;
		topIndexes[stackNum]++;
	}
	
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) {
			System.out.println("Stack Empty; Nothing to pop;");
			return -1;
		}
		int topIndex = getTopIndex(stackNum);
		int value = array[topIndex];
		array[topIndex] = 0;
		topIndexes[stackNum]--;
		return value;
	}
	
	public boolean isFull(int stackNum) {
		return topIndexes[stackNum] == stackSize;
	}
	
	public boolean isEmpty(int stackNum) {
		return topIndexes[stackNum] == 0;
	}
	
	public int peek(int stackNum) {
		if (isEmpty(stackNum)){
			throw new EmptyStackException(); 
		}
		int topIndex = getTopIndex(stackNum);
		int value = array[topIndex];
		return value;
	}
	
	public int getTopIndex(int stackNum) {
		int offset = stackNum * stackSize;
		int size = topIndexes[stackNum];
		return offset + size - 1;
	}
	
}
