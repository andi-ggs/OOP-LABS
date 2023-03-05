package LAB3;

public class Magazin {
	
	public String nume;
	Produs tigari, cola, seminte;
	
	public Magazin(String nume, Produs tigari, Produs cola, Produs seminte) {
		this.nume = nume;
		this.tigari = tigari;
		this.cola = cola;
		this.seminte = seminte;
	}
	public String toString() {
		return tigari.toString() + cola.toString() + seminte.toString();
 	}
	
	public double getTotalMagazin() {
		double suma = 0;
		suma = tigari.getTotalProdus(tigari) + cola.getTotalProdus(cola) + seminte.getTotalProdus(seminte);
		return suma;
	}
	
	
	public static void main(String args[]) {
		Produs tigari = new Produs("tigari", 25, 10);
		Produs cola = new Produs("cola", 5, 5);
		Produs seminte = new Produs("seminte", 2, 4);
		
		Magazin penny = new Magazin("Penny", tigari, cola, seminte);
		System.out.println(penny);
		double suma = penny.getTotalMagazin();
		System.out.println(suma);
	}
	
	

}
