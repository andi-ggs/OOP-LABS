package LAB2;

import java.util.Vector;

public class PROB6 {
	
	public static Integer[] getClasses(Vector v) {
		Integer[] classes = new Integer[5];
		int i = 0;
		for(i = 0; i < 5; i++)
			classes[i] = 0;
		for(Object o : v)
		{
			if( o instanceof Double)
			{
				classes[0]++;
			}
			
			if(o instanceof String)
			{
				classes[1]++;
			}
			
			if(o instanceof Integer)
			{
				classes[2]++;
			}
			
			if(o instanceof Character)
			{
				classes[3]++;
			}
			
			if(o instanceof Boolean)
			{
				classes[4]++;
			}
		}
	}
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(7.5);
		v.add("String");
		v.add(true);
		v.add(false);
		v.add("sanki");
		v.add(8);
		v.add(9);
		v.add("#");
		
		Integer[] classes = getClasses(v);
		System.out.println("Double: " + classes[0]);
		System.out.println("String: " + classes[1]);
		System.out.println("Integer: " + classes[2]);
		System.out.println("Char: " + classes[3]);
		System.out.println("Boolean: " + classes[4]);		
	}

}
