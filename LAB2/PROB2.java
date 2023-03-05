package LAB2;

public class PROB2 {
	public int aparitii(String s1, String s2) {
		String[] words = s1.split(" ");
		int nr = 0;
		int i = 0;
		for(i = 0; i < words.length; i++)
		{
			if(s2.equals(words[i]) == true)
				nr ++;
		}
		return nr;
	}

	
	public static void main(String args[]) {
		String s1 = "sir1 si sir2 sunt 2 siruri";
		String s2 = "sir2";
		PROB2 ap = new PROB2();
		int nr = ap.aparitii(s1, s2);
		System.out.println(nr);
	}
}
