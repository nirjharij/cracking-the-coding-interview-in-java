package arraysAndStrings;

public class urlify {
	public static char[] urlify(String str, int strLength) {
		char[] s = new char[str.length()];
		  
        for (int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
        
		int numberOfSpaces = 0;
		for (int i = 0; i < strLength; i++) {
			if (s[i] == ' ')
				numberOfSpaces++;
		}
		
		int fullLength = strLength + numberOfSpaces * 2;
		int lastFilled = fullLength - 1;
		
		for (int i=strLength-1; i>0; i--) {
			if (s[i] == ' ') {
				s[lastFilled--] = '0';
				s[lastFilled--] = '2';
				s[lastFilled--] = '%';
			}
			else {
				s[lastFilled--] = s[i];
			}
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(urlify("Mr John Smith    ", 13));
	}
}
