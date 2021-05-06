// Assumptions:
// 1. String contains characters in range a-z
// 2. Not considering any special characters like spaces etc

package arraysAndStrings;

public class palindromePermutation {
	public static boolean checkPalindromePermutation(String s) {
		int num = 0;
		for(char ch: s.toCharArray()) {
			if (ch == ' ')
				continue;
			int newch = ch - 'a';
			num = num ^ (1 << newch);
		}
		
		return (num == 0 || containsSingleSetBit(num));
		
	}
	
	public static boolean containsSingleSetBit(int num) {
		return ((num & num-1) == 0);
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindromePermutation("taco cat"));
	}
}
