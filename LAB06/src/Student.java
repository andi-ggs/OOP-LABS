package src;

import java.util.Vector;
import java.util.Vector;

public class Student implements Persoana {

    private String nume;
    private Vector <Double> medie;

    public Student(String nume, Vector medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public double calculMedieGenerala() {
        double suma = 0;
        int i = 0;
        double media = 1;
        int nr = 0;
        for(i = 0; i < this.medie.size(); i++) {
            suma = suma + medie.get(i);
            nr = nr + 1;
        }
        media = suma / nr;
        return media;
    }

    @Override
    public String getNume() {

        return this.nume;
    }

    @Override
    public void setNume(String nume) {

        this.nume = nume;
    }

    public void addMedie(Vector medie) {
        medie.add(medie);
    }

    public int compareTo(Object o) {
        Student str = (Student) o;
        int b = (nume.compareTo(str.nume));
        if (b == 0) {
            if ((this.calculMedieGenerala() - str.calculMedieGenerala()) > 0)
                return -1;
            if ((this.calculMedieGenerala() - str.calculMedieGenerala()) < 0)
                return 1;
        }
        return b;
    }


    public String toString(){
        return nume + " -> " +  this.calculMedieGenerala();
    }
}
