package arraysAndStrings;

public class test {
	public static void main(String[] args) {
		isUnique iu = new isUnique();
		boolean temp = iu.isUniqueString("abcda");
		if (temp){
			System.out.println("Is unique");
		}
		else {
			System.out.println("Is not unique");
		}
	}
}
