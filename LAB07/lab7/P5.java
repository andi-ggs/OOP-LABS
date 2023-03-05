package LAB7;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

import static java.lang.String.valueOf;

public class P5 {

    public TreeMap read() {

        TreeMap dictionar = new TreeMap<String, Integer>();
        String pathname = "/home/diamondsuncerra/laboratoare/src/LAB6/Arhiva6";
        File director = new File(pathname);
        File[] files = director.listFiles();

        for(Object o : files){

            File fis = (File) o;
            long size = fis.getTotalSpace();
            String nume = fis.toString();
            dictionar.put(nume, size);

        }
        return dictionar;
    }

    public String toString(TreeMap dictionar){
        String aux = "";
        for(Object o : dictionar.keySet()){

            aux = aux.concat((String)o);
            aux = aux.concat(" ");
            Object o1 = dictionar.get(o);
            aux = aux.concat(valueOf(o1));
            aux = aux.concat(" ");

        }
        return  aux;
    }

    public static void main(String  []args){
        P5 obj = new P5();
        TreeMap dictionar = obj.read();

        TreeMap dictionar2 = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                // ce naiba fac aici
                return 0;
            }
        });

        String aux = obj.toString(dictionar);
        System.out.println(aux);
    }

}
