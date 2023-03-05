package src;

import java.util.Comparator;
import java.util.Vector;

public class Tren implements Comparator<Tren> {
    public Vector<Vagon> vagoane = new Vector<>();
    public int nrColete = 0;

    public void addVagon(Vagon o) {
        vagoane.addElement(o);
    }

    public void addNrColete() {
        for (Vagon vagon : vagoane)
            nrColete += vagon.getDelivery();
    }

    public int getNrColete() {
        return this.nrColete;
    }

    @Override
    public int compare(Tren tren1, Tren tren2) {
        return ((Comparable)tren1.getNrColete()).compareTo(tren2.getNrColete());
    }
}
