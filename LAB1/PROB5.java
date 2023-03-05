package LAB1;

public class PROB5 {
	public int power(int x, int y) {
		if (y == 0) return 1;
		else return x*power(x, y-1);
	}
	
	public static void main(String args[]) {
		int x = 3;
		int y = 3;
		PROB5 obiect = new PROB5();
		int result = obiect.power(3, 3);
		
		System.out.println(result);
		
		double result2 = Math.pow(3, 3);
		
		System.out.println(result2);
		
	}
}
