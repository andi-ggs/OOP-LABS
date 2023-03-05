package LAB3;

public class Fractie {
	private int numitor, numarator;
	
	public Fractie(int numitor, int numarator) {
		this.numitor = numitor;
		this.numarator = numarator;
	}
	
	public String toString() {
		return numitor + "/" + numarator;
	}
	
	public void adunare(Fractie obj) {
		numitor += obj.numitor;
		numarator += obj.numarator;
	}
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Fractie)) return false;
		Fractie fr = (Fractie) o;
		return (fr.numitor == numitor && fr.numarator == numarator);
	}
	
	public static void main(String args[]) {
		Fractie obj = new Fractie(2,2);
		System.out.println(obj);
		Fractie obj1 = new Fractie(1, 4);
		obj.adunare(obj1);
		System.out.println(obj);
		Fractie obj2 = new Fractie(3,6);
		boolean ok;
		ok = obj.equals(obj2);
		System.out.println(ok);

	}

}
