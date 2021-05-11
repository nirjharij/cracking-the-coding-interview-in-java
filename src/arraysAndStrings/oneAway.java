package arraysAndStrings;

public class oneAway {
	static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }
	
	public static int editDistance(String s1, String s2, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;
		
		if (s1.charAt(m-1) == s2.charAt(n-1)) {
			return editDistance(s1, s2, m-1, n-1);
		}
		
		return 1 + min(editDistance(s1, s2, m, n-1), 
					editDistance(s1, s2, m-1, n), 
					editDistance(s1, s2, m-1, n-1));
	}
	
	public static boolean checkOneAway(String s1, String s2) {
		return (editDistance( s1, s2, s1.length(), s2.length()) == 1);
	}
	
	public static void main(String[] args) {
		System.out.println(checkOneAway("pale", "ple"));
	}
}
