package stacksAndQueues;

public class test {
	public static void main(String[] args) {
		threeInOne tio = new threeInOne(2);
		tio.push(0, 1);
		tio.push(0, 2);
		tio.push(1, 3);
		tio.push(1, 4);
		tio.push(2, 5);
		tio.push(2, 6);
		System.out.println(tio.pop(0));
		System.out.println(tio.peek(0));
		System.out.println(tio.pop(1));
		System.out.println(tio.peek(1));
		System.out.println(tio.pop(2));
		System.out.println(tio.peek(2));
	}
}
