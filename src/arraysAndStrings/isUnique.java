package arraysAndStrings;


public class isUnique {
	public boolean isUniqueString(String s) {
		int num = 0;
		
		int length = s.length();
		for (int i=0; i<length; i++) {
			int move_by = s.charAt(i) - 'a';
			int temp = 1 << move_by;
			
			if ((num & temp) > 0) {
				return false;
			}
			num |= temp;
		}
		return true;
	}
}
