package bitManipulation;


public class insertion {
	public static int insert(int N, int M, int i, int j) {
		while (M != 0 && i<=j) {
			int bit = M & 1;
			
			bit = bit << i;
			N = N | bit;
			
			M = M >> 1;
			i+=1;
		}
		return N;	
	}
	
	public static void main(String[] args) {
		System.out.println(insert(1024, 19, 2, 6));
	}
}
