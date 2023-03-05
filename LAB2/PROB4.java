package LAB2;

import java.util.Random;
import java.util.Vector;

public class PROB4 {

	public static void main(String args[]) {
		Vector array1 = new Vector(15);
		Vector array2 = new Vector(15);
		
		Random generator = new Random();
		
		for (int i = 0; i < 15; i++)
		{
			int nr1 = generator.nextInt(25);
			array1.add(nr1);
		}
		
		System.out.println("array1 : " + array1);
		
		for (int i = 0; i < 15; i++)
		{
			int nr2 = generator.nextInt(25);
			array2.add(nr2);
		}
		
		System.out.println("array2 : " + array2);
		
		boolean ok;
		
		Vector array3 = new Vector(30);
		
		for(Object obiect:array1)
		{
			int element = (int) obiect;
			array3.add(element);
		}
		
		for(Object obiect:array2)
		{
			int element = (int) obiect;
			ok = array3.contains(element);
			if(ok == false)
			{
				array3.add(element);
			}
		}
		
		System.out.println("array3 : " + array3);
		System.out.print("\n");
		
		Vector array4 = new Vector(15);
		
//		for(Object obiect:array1)
//		{
//			int element = (int) obiect;
//			array4.add(element);
//		}
		
		for(Object obiect:array1)
		{
			int element = (int) obiect;
			for(Object obiect1:array2)
				{
				int element1 = (int) obiect1;
				ok = array1.contains(element1);
				if(ok == true)
					array4.add(element1);
			}
		}
		System.out.println("array4 : " + array4);
		System.out.print("\n");
		
		Vector array5 = new Vector(15);
		
		for(Object obiect:array1)
		{
			int element = (int) obiect;
			for(Object obiect1:array2)
				{
				int element1 = (int) obiect1;
				ok = array1.contains(element1);
				if(ok == false)
					array5.add(element);
			}
		}
		System.out.println("array5 : " + array5);
		
	}
}
