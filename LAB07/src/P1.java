import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.Comparator;

public class P1 {
    public TreeSet printWords (String path) {
        RandomAccessFile file;
        try {
            file = new RandomAccessFile(path, "r");
            file.seek(0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        TreeSet tree = new TreeSet();
        String linie = "";

        do {
            StringTokenizer str = new StringTokenizer(linie, " (,./:=?!>,<,-,)");
            String cuvant;

            while (str.hasMoreTokens()) {
                cuvant = str.nextToken();
                tree.add(cuvant);
            }

            try {
                linie = file.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (linie != null);
            return tree;
        }

       public TreeSet printWordsComparator(TreeSet tree){
        TreeSet newtree = new TreeSet();
        newtree = (TreeSet)tree.descendingSet();
        return newtree;
           }
       }
