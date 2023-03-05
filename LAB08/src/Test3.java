import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
        list.add(20);
        list.addFirst(5);
        list.add(22);
        list.add(25);
        list.add(30);

        int last = 0;
        System.out.println("Afisare 1");
        for (Object i : list) {
            Integer i1 = (Integer) i;
            System.out.print(i1 + ", ");
            if (i1 < last) {
                System.err.println("LinkedList a fost implementata gresit.");
            }
            last = i1;
        }
        System.out.println();

        System.out.println("Afisare 2");
        Iterator<Integer> itr1 = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }
        System.out.println();
    }
}
