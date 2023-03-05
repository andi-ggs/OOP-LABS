package LAB5;


class Animal {
    private String nume;
    private String culoare;
    
    {
        System.out.println("Bloc 1 - Animal");
        nume = "Animal";
        culoare = "negru";
    }
    
    {
        System.out.println("Bloc 2 - Animal");
    }
    
    public String getCuloare() {
         return culoare;
    }
}

class Caine extends Animal {
    private String tipRasa;
    
    {
        tipRasa = "medie";
        System.out.println("Bloc 1 - Caine " + getCuloare());
    }
    
    {
        System.out.println("Bloc 2 - Caine");
    }
    
    {
        System.out.println("Bloc 3 - Caine");
        tipRasa = "mare";
    }
}
    
    class SharPei extends Caine {
        private int varsta;
        private static String taraProvenienta;
        
        static {
            System.out.println("Bloc 1 - SharPei");
            taraProvenienta = "China";
        }
        
        {
            System.out.println("Bloc 2 - SharPei " + taraProvenienta);
        }
        
        {
            varsta = 5;
            System.out.println("Bloc 3 - SharPei " + varsta);
        }
    }
    
class PROB1 {
	public static void main(String args[]) {
        SharPei cutu = new SharPei();
    }
}
