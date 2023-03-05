package LAB7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P1 {

    public TreeSet printWords (String pathname){

        RandomAccessFile fis;
        try {
            fis = new RandomAccessFile(pathname,"r");
            fis.seek(0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TreeSet arbore = new TreeSet<String>();

        // trb sa citesc din fisier
        String linie = "";

        do{
            StringTokenizer str = new StringTokenizer(linie," ,./!()- ==+_-?");
            String cuvant;
            while(str.hasMoreTokens()){

                cuvant = str.nextToken();
                arbore.add(cuvant); // prob aici modific sa vad alfabetic
                System.out.println(cuvant);
            }//fiecare cuvant de pe linie

            try {
                linie = fis.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        while(linie != null);//am linii in fisier

        return arbore;
    }

    public TreeSet printWordsComparator(TreeSet arbore){

        TreeSet arboreNou = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s2.compareTo(s1);
            }
        });

        arboreNou.addAll(arbore);

        while(arbore.isEmpty() != true){
            String aux = (String) arbore.last();
            arboreNou.add(aux);
            arbore.remove(aux);
        }
        // Collections.sort(arbore,c)??
        return arboreNou;
    }
    //INTREBARE:: CUM FACEAM CU COMPARATOR CA PROBABIL NU E CORECT METODA

    public static void main(String []args){

        P1 obj = new P1();
        TreeSet tree = obj.printWords("/home/diamondsuncerra/laboratoare/src/LAB7/test01.txt");
        System.out.println(tree);
        TreeSet treeNou = obj.printWordsComparator(tree);
        System.out.println(treeNou);
    }

}
