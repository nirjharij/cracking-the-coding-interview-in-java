//Assumptions:
//	1. String contains letters from a-z
//  2. Duplicates allowed

package arraysAndStrings;


public class checkPermutation {
	static boolean permutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		
		int[] arr = new int[26];
		
		for (int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			arr[ch-'a']++;
		}
		
		for (int i=0;i<s2.length();i++) {
			char ch = s2.charAt(i);
			arr[ch-'a']--;
			if (arr[ch-'a'] < 0) {
				return false;
			}
		}
		
		for (int i=0;i<26;i++) {
			if (arr[i] != 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(permutation("abcd", "cbac"));
	}
}
