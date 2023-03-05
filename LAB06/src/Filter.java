package src;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.regex.Pattern;

public class Filter implements FileFilter {

    Vector types = new Vector();
    Vector words = new Vector();

    public void read_types (String path) throws IOException {
        RandomAccessFile file = null;
        String aux;
        try {
            file = new RandomAccessFile(path, "r");
            try {
                file.seek(0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        do {
            aux = file.readLine();
            if (aux == null)
                break;
            if (path.compareTo("extension.in") == 0) {
                types.add(aux);
            }
            else if (path.compareTo("words.in") == 0) {
                words.add(aux);
            }
        } while(aux != null);
        file.close();
    }

    @Override
    public boolean accept(File path) {
        String name = new String(String.valueOf(path));
        StringTokenizer str = new StringTokenizer(name, "/");
        String str1 = null;
        while(str.hasMoreTokens()) {
            str1 = str.nextToken();
        }

        StringTokenizer str2 = new StringTokenizer(str1, "." );
        String s1 = str2.nextToken();
        String s2 = str2.nextToken();
        String aux = ".";
        s2 = aux.concat(s2);
        String finish = s1.substring(s1.lastIndexOf("\\") + 1);
        String[] tokens = finish.split(Pattern.quote(" _"));
        if(words.contains(tokens[tokens.length-1]) == false) return false;
        if(types.contains(s2) == false) return false;
        return true;
    }
}
