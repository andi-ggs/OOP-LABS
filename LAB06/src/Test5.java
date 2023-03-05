package src;

public class Test5 {
    public static void main(String args[]) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());
        Tren t1 = new Tren();
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriA());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new CalatoriB());
        t1.addVagon(new Marfa());
        t.addNrColete();
        t1.addNrColete();
        int y = t.compare(t, t1);
        System.out.println(y);
    }
}
