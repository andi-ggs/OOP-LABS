import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String args[]) {
        SListSet list = new SListSet();
        SListSet list2 = new SListSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s2.compareTo(s1);
            }
        });

        String path = "E:\\ANUL II\\PROGRAMARE ORIENTATA PE OBIECT\\LABORATOR\\LAB07\\test01.txt";
        RandomAccessFile file;

        try{
            file = new RandomAccessFile(path, "r");
            file.seek(0);
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String line = "";

        do {
            StringTokenizer str = new StringTokenizer(line, " (,./:=?!>,<,-,)");
            String word;

            while(str.hasMoreTokens()) {
                word = str.nextToken();
                list2.add(word);
                list.add(word);
            }

            try {
                line = file.readLine();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        while(line != null);
        System.out.println(list);
        System.out.println(list2);
    }
}
