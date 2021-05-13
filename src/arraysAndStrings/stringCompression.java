package arraysAndStrings;

public class stringCompression {
	public static void compressString(String s1) {
		StringBuilder finalStr = new StringBuilder();
		
		int count = 0;
		
		for (int i=0; i<s1.length(); i++) {
			count++;
			
			if (i+1 >= s1.length() || s1.charAt(i+1) != s1.charAt(i)) {
				finalStr.append(s1.charAt(i));
				finalStr.append(count);
				count=0;
			}
		}
		
		if (finalStr.length() < s1.length())
			System.out.println(finalStr.toString());
		else
			System.out.println(s1);
	}
	
	public static void main(String[] args) {
		compressString("aaaabbbbbcccccdd");
		compressString("aabcd");
	}
}
