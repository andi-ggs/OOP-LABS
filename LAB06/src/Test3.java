package src;

import java.util.Collections;
import java.util.Vector;

public class Test3 {
    public static void main(String args[]) {
        Vector v = new Vector();
        Vector a1 = new Vector();
        a1.add(9.50);
        a1.add(10.00);
        a1.add(6.70);
        Vector a2 = new Vector();
        a2.add(8.60);
        a2.add(7.80);
        a2.add(8.10);
        Vector a3 = new Vector();
        a3.add(7.00);
        a3.add(9.18);
        a3.add(9.90);

        Student Popescu = new Student("Popescu", a1);
        Student Ionescu = new Student("Antonescu", a2);
        Student Popa = new Student("Antonescu", a3);

        v.add(Popescu);
        v.add(Ionescu);
        v.add(Popa);
        Collections.sort(v);
        System.out.print(v);
    }
}
