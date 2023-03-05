package LAB7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class SListSet extends LinkedList implements SortedSet {
    public Comparator comparator;

    public SListSet(){
        comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

    }

    public SListSet(Comparator c){
        comparator = c;
    }

    //comparator folosit (null pentru  comparatia naturala)
    public boolean add(Object o){

        if(this.contains(o))
            return true;

        super.add(o);
        Collections.sort(this,comparator);

        return false;
    }
    //adauga un element in multime daca nu exista deja si sorteaza multimea
    public Object first(){
        Object obj = this.removeFirst();
        return obj;
    }
    //primul obiect din multime
    public Object last(){
        Object obj = this.removeLast();
        return obj;
    }


    @Override
    public Comparator comparator() {
        return null;
    }

    // ultimul obiect din multime
    public SortedSet subSet(Object from, Object to){
       SortedSet set = new SListSet();
       int i,n;
       i = this.indexOf(from);
       n = this.indexOf(to);

       for( ;i<=n; i++)
           set.add(this.get(i));

       return set;

    }
    // o submultime ordonata
    public SortedSet headSet(Object to){
        SortedSet set = new SListSet();
        int n = this.indexOf(to);

        for(int i = 1; i <=n; i++)
            set.add(this.get(i));
        return set;
    }
    // o submultime cu primele  obiecte
    public SortedSet tailSet(Object from){
        SortedSet set = new SListSet();
        int n = this.indexOf(from);
        int m = this.size();
        for(int i = n; i <=m; i++)
            set.add(this.get(i));
        return set;
    }
    //o submultime cu ultimele obiecte
}

class Test03{
    public static void main(String []args) {

        SListSet obj = new SListSet(); // ordine naturala
        SListSet obj2 = new SListSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s2.compareTo(s1);
            }
        });
        // ordine inversa

        String pathname = "/home/diamondsuncerra/laboratoare/src/LAB7/test01.txt";
        RandomAccessFile fis;
        try {
            fis = new RandomAccessFile(pathname, "r");
            fis.seek(0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String linie = "";

        do{
            StringTokenizer str = new StringTokenizer(linie," ,./!()- ==+_-?");
            String cuvant;
            while(str.hasMoreTokens()){

                cuvant = str.nextToken();
                obj2.add(cuvant); // prob aici modific sa vad alfabetic
                //System.out.println(cuvant);
            }//fiecare cuvant de pe linie

            try {
                linie = fis.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        while(linie != null);//am linii in fisier

        System.out.println(obj2);
        //INTREBARE: !!!! SA NU UITI
        // DECI COMPARATORUL ASTA IL PUN LA COLLECTIONS.SORT DA/???

    }//main
}