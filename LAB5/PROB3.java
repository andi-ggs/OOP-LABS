package LAB5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

class NumarNegativ extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumarNegativ() {
		super("Numarul introdus este negativ!\n");
	}
}

public class PROB3 {
	
	public void myRead(Vector v) throws NumarNegativ {
	Scanner s = new Scanner(System.in);
	int nr = 0; 
	while(nr >= 0) {
		nr = s.nextInt();
		if (nr < 0) {
			throw new NumarNegativ();
		}
		v.add(nr);
	}	
}
	
	public static void main(String args[]) {
		PROB3 obj = new PROB3();
		Vector v = new Vector();
		try {
			obj.myRead(v);
		} catch(NumarNegativ a) {
			a.printStackTrace();
			System.out.println("Aiurea\n");
		} finally {
			System.out.println("Done -> " + Collections.max(v));
		}
		
	}
}
