import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P4 {

    public void printCuvinte(TreeMap dictionar){
        //fiecare cuvant cu lista liniilor pe care apare +

        for(Object key : dictionar.keySet()){

            LinkedList list = (LinkedList) dictionar.get(key);
            int aparitii = 0;
            Iterator it  = list.iterator();
            System.out.println("CUVANT: " + key + " \nLINII: " );
            while(it.hasNext()) {
                aparitii++;
                System.out.println(it.next() + " ");
            }
            System.out.println("\nNR TOTAL DE APARITII: " + aparitii + "\n");
        }

    }//printCuvinte


    public static void main(String args[]) {
        TreeMap<String, LinkedList> dictionar = new TreeMap<String,LinkedList>();
        String pathname = "E:\\ANUL II\\PROGRAMARE ORIENTATA PE OBIECT\\LABORATOR\\LAB07\\test01.txt";
        RandomAccessFile fis;

        try {
            fis = new RandomAccessFile(pathname, "r");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String linie = "";
        int nrLinie = -1;

        do{
            nrLinie++;
            StringTokenizer str = new StringTokenizer(linie," ,./!()- ==+_-?");
            String cuvant;

            while(str.hasMoreTokens()){

                cuvant = str.nextToken();

                if(!dictionar.containsKey(cuvant)) {
                    LinkedList list = new LinkedList<>();
                    list.add(nrLinie);
                    dictionar.put(cuvant,list);
                }
                else {
                    LinkedList list = dictionar.get(cuvant);
                    list.add(nrLinie);
                    dictionar.replace(cuvant,list);
                }

            }//fiecare cuvant de pe linie


            try {
                linie = fis.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        while(linie != null);

        P4 obj = new P4();
        obj.printCuvinte(dictionar);


    }//main


}
