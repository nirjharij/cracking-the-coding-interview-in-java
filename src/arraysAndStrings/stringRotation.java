package arraysAndStrings;

public class stringRotation {
	public static boolean isRotated(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		
		return isSubstring(s1+s2, s2);
	}
	
	public static boolean isSubstring(String s1, String s2) {
		return s1.contains(s2);
	}
	
	public static void main(String[] args) {
		System.out.println(isRotated("waterbottle", "erbottlewat"));
	}
}
