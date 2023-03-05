package LAB3;

public class Punct {
	
	public int x, y;
	
	public Punct(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punct() {
		this(0,0);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	double distance(int x, int y) {
		double result1;
		double result2;
		double result;
		result1 = (x - this.x)*(x - this.x);
		result2 = (y - this.y)*(y - this.y);
		result = result1 + result2;
		result = Math.sqrt(result);
		return result;
	}
	
	double distance(Punct p1) {
		double result;
		result = Math.sqrt((p1.x - this.x)*(p1.x - this.x) + (p1.y - this.y)*(p1.y - this.y));
		return result;
	}
	
	public static void main(String args[]) {
		Punct A = new Punct();
		Punct B = new Punct();
		A.setX(1);
		A.setY(2);
		B.setX(-1);
		B.setY(3);
		double dist;
		dist = A.distance(B);
		System.out.println(dist);
	}
	
	
	

}
