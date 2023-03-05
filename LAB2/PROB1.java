package LAB2;

public class PROB1 {
	public static void main(String args[]) {
		String s1 = "si";
		String s = "sir1 si cu sir2 fac un sir3";
		int nr = 0;
		int index = 0;
		int first = 0;
		for (int i = 0; i < s.length(); i++)
		{
			index = s.indexOf(s1, index);
			if(index != -1)
			{
				index = index + s1.length();
				nr ++;
			}
			
		}
		System.out.println(nr);
	}
}
