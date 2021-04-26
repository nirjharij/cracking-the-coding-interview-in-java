package stacksAndQueues;


public class stackMin{
	static final int MAX = 1000;
    static int mainTop = -1;
    static int minTop = -1;
    static int mainStack[] = new int[MAX]; // Maximum size of Stack
    static int minStack[] = new int[MAX];
    
	
	static boolean isEmpty()
    {
        return (mainTop < 0);
    }
	
	static void push(int x)
    {
        if (mainTop >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        else {
            mainStack[++mainTop] = x;
            System.out.println(x + " pushed into main stack");
            if (isEmptyMinStack() | x < peekMin() ) {
            	pushMin(x);
            }
        }
    }
	
	static int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            int min =  mainStack[mainTop--];
            if (min == peekMin())
            	popMin();
            return min;
        }
    }
	
	static int peek() {
		if (!isEmpty()) {
			return mainStack[mainTop];
		}
		System.out.println("Main Stack empty");
		return -1;
	}
	
	static int peekMin() {
		if (!isEmptyMinStack()) {
			return minStack[minTop];
		}
		System.out.println("Min Stack empty");
		return -1;
	}
 
	static int popMin() {
		if (isEmptyMinStack()) {
            System.out.println("Min Stack Underflow");
            return -1;
        }
        else {
            return minStack[minTop--];
        }
	}
	
	static boolean isEmptyMinStack()
    {
        return (minTop < 0);
    }
	
	static void pushMin(int x) {
		if (minTop >= (MAX - 1)) {
            System.out.println("Min Stack Overflow");
        }
        else {
            minStack[++minTop] = x;
            System.out.println(x + " pushed into min stack");
        }
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		System.out.println(peekMin());
		push(0);
		push(3);
		System.out.println(peekMin());
		pop();
		pop();
		System.out.println("Min: " + peekMin());
	}
}