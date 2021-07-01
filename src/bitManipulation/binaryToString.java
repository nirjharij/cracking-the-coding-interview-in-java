package bitManipulation;

public class binaryToString {
	public static String binToSt(double num) {
		if (num >= 1 || num <= 0)
			return "ERROR";
		
		double frac = 0.5;
		StringBuilder outBuilder = new StringBuilder();
		outBuilder.append(".");
		
		while (num > 0) {
			if (outBuilder.length() > 32) {
				return "ERROR";
			}
			if (num >= frac) {
				outBuilder.append(1);
				num -= frac;
			}
			else {
				outBuilder.append(0);
			}
			frac /= 2;
		}
		return outBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(binToSt(0.72));
	}
}
