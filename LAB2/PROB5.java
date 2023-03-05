package LAB2;

public class PROB5 {
	
	public String[] cenzurare(String s1, String s2[]) {
		String[] words_array = s1.split(" ");
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < words_array.length; i++)
		{
			char[] words = new char [words_array[i].length()];
			for(j = 0; j < s2.length; j++)
				if(words_array[i].equals(s2[j]))
				{
					words[0] = words_array[i].charAt(0);
					words[words_array[i].length() - 1] = words_array[i].charAt(words_array[i].length() - 1);
					for(int k = 1; k < words_array[i].length() - 1; k++)
					{
						words[k] = '*';
					}
					words_array[i] = String.valueOf(words);
				}
		}
		return words_array;
		
	}
	
	public static void main(String args[]) {
		String text = "Un terorist avea o bomba";
		String[] cuvinte = new String[2];
		cuvinte[0] = "terorist";
		cuvinte[1] = "bomba";
		
		String[] words_array = text.split(" ");
		int i = 0;
		int j = 0;
		boolean ok = false;
		
		for(i = 0; i < words_array.length; i++)
		{
			for(j = 0; j < cuvinte.length; j++)
				if(cuvinte[j].equals(words_array[i]))
					ok = true;
		}
		if(ok == true)
			System.out.println("Text suspect");
		else
			System.out.println("Nimic suspect");
		
		PROB5 prb5 = new PROB5();
		String[] rezultat;
		rezultat = prb5.cenzurare(text, cuvinte);
		for(String s : rezultat) {
		System.out.print(s + " ");
		}
	}

}
