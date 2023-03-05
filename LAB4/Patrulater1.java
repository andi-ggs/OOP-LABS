package LAB4;

class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;
 
    public Patrulater() {
        this(0, 0, 0, 0);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }
 
    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }
 
    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }
 
    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
}

class Paralelogram extends Patrulater {
	
	public double Arie() {
		unghi1 = Math.toRadians(unghi1);
		double result = Math.sin(unghi1);
		return latura1 * latura2 * result;
		
	}
	
	public Paralelogram(int latura1, int latura2, double unghi1, double unghi2) {
		super(latura1, latura2, latura1, latura2, unghi1, unghi2, unghi1, unghi2);
		
	}
}

class Romb extends Paralelogram {
	private double diag1, diag2;
	
	public double Arie() {
		double result = (diag1 * diag2) / 2;
		return result;
	}
	
	public Romb (int latura, double unghi1, double unghi2, double diag1, double diag2) {
		super(latura, latura, unghi1, unghi2);
		this.diag1 = diag1;
		this.diag2 = diag2;
		
	}
}

class Dreptunghi extends Paralelogram {
	
	public double Arie() {
		return latura1 * latura2;
	}
	
	public Dreptunghi(int latura1, int latura2) {
		super(latura1, latura2, 90, 90);
	}
}

class Patrat extends Dreptunghi {
	
	public double Arie() {
		return latura1 * latura1;
	}
	
	public Patrat(int latura) {
		super(latura, latura);
	}
	
}

public class Patrulater1 {
	
	public static void main(String args[]) {
		Paralelogram paralelogram = new Paralelogram(4,4,90,90);
		double rez = paralelogram.Arie();
		System.out.println(rez);
		
		Romb romb = new Romb(4, 90, 90, 5.65, 5.65);
		double rez1 = romb.Arie();
		System.out.println(rez1);
		
		Dreptunghi dreptunghi = new Dreptunghi(5,6);
		double rez2 = dreptunghi.Arie();
		System.out.println(rez2);
		
		Patrat patrat = new Patrat(4);
		double rez3 = patrat.Arie();
		System.out.println(rez3);
	}
}