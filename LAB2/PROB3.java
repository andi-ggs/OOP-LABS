
package LAB2;

import java.util.Random;
import java.util.Vector;

public class PROB3 {
	public Vector vector() {
		Vector object = new Vector(20);
		Random generator = new Random();
		
		for (int i = 0;i < 20; i++)
		{
			int nr = generator.nextInt(10);
			object.add(nr);
		}
		return object;
	}
	
	public int aparitii(Vector v, int x)
	{
		int nr = 0;
		while(v.contains(x))
		{
			nr++;
			v.removeElement(x);
		}
	return nr;
	}
	
	public static void main(String args[]) {
		PROB3 obj = new PROB3();
		Vector array = obj.vector();
		int x = 8;
		System.out.println(array);
		
		int max  = 0;
		int min = 10;
		
		int suma = 0;
		int numere = 0;
		int ind = 0;
		for(Object obiect:array)
		{
			int element = (int) obiect;
			if(element > max)
				max = element;
			if(element < min)
				{min = element;
				ind = array.indexOf(element);
				}
				
			suma = suma + element;
			numere ++;
		}
		float media;
		media = suma/numere;
		System.out.println(max);
		System.out.println(ind);
		System.out.println(media);
		
		
		int nr = obj.aparitii(array, x);
		
		System.out.println(nr);
		System.out.println(array);
	
		
		
	}
	
}

