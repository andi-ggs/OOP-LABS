package LAB1;

public class PROB6 {

	public boolean prim(int x) {
		int divizori = 0;
		for (int d = 1; d <= x; d++)
		{
			if(x%d == 0)
				divizori = divizori + 1;
		}
		if(divizori == 2)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]) {
		int n = 20;
		PROB6 obiect = new PROB6();
		for(int i = 0; i < n; i++)
			{boolean result = obiect.prim(i);
			
			System.out.println(i + " " + result);}
	}
}
