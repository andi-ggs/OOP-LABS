package LAB3;

public class Numar {
	public int numar;
	
	public Numar(int numar) {
		this.numar = numar;
	}
	
	public String toString() {
		return numar + " ";
	}
	
	public int suma(int a) {
		return this.numar + a;
	}
	
	public int suma(int a, int b) {
		return this.numar + a + b;
	}
	
	public int suma(int a, int b, int c) {
		return this.numar + a + b + c;
	}
	
	public int suma(int a, int b, int c, int d) {
		return this.numar + a + b + c + d;
	}
	
	
	public static void main(String args[]) {
		Numar nr = new Numar(7);
		System.out.println(nr);
		int res1 = nr.suma(10);
		System.out.println(res1);
		int res2 = nr.suma(10, 1);
		System.out.println(res2);
		int res3 = nr.suma(10, 1, 2);
		System.out.println(res3);
		int res4 = nr.suma(10, 1, 2, 10);
		System.out.println(res4);
		
		
	}
}
