package LAB3;

public class Produs {
	
	private String nume;
	private double pret;
	private int cantitate;
	
	public Produs(String nume, double pret, int cantitate) {
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
	}

	public String toString() {
		return "Produs " + nume + " " + pret + " " + cantitate + "\n";
		}
	
	public double getTotalProdus(Produs o) {
		if(o == null) return 0;
		double p = 1;
		p = p * o.cantitate;
		p = p * o.pret;
		return p;
	}
	
	public static void main(String args[]) {
		Produs object = new Produs("tigari",25,10);
		System.out.println(object);
		Produs obj = new Produs("cola", 5, 10);
		double rezultat = obj.getTotalProdus(obj);
		System.out.println(rezultat);
		
	}
}
