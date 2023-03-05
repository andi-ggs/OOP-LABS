import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        P1 tree = new P1();
        TreeSet set = tree.printWords("test01.txt");
        System.out.println(set);
        TreeSet set2 = tree.printWordsComparator(set);
        System.out.println(set2);
    }
}