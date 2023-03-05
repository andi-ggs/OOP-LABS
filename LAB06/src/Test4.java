package src;

import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String args[]) {
        Filter obj = new Filter();
        try {
            obj.read_types("extension.in");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            obj.read_types("words.in");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(obj.types);
        System.out.println(obj.words);

        File file = new File("E:\\ANUL II\\PROGRAMARE ORIENTATA PE OBIECT\\LABORATOR\\LAB06\\fisiere_prolog\\test.hs");
        boolean ok = obj.accept(file);
        System.out.println(ok);
    }
}
