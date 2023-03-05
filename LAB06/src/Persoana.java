package src;

import java.util.Vector;


public interface Persoana extends Comparable {
    public double calculMedieGenerala();
    public String getNume();
    public void setNume(String nume);
    public void addMedie(Vector medie);
}
