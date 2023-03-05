import java.util.*;

public class SListSet extends LinkedList implements SortedSet {
    //SortedSet list = new SListSet();
    public Comparator comparator;

    public SListSet(){
        comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }

    public SListSet(Comparator c) {
        comparator = c;
    }

    @Override
    public Comparator comparator() {
        return null;
    }

    public boolean add(Object o){
        if(this.contains(o))
            return true;
        super.add(o);
        Collections.sort(this,comparator);
        return false;
    }


    @Override
    public SortedSet subSet(Object fromElement, Object toElement) {
        SortedSet list2 = new SListSet();
        int start = this.indexOf(fromElement);
        int last = this.indexOf(toElement);
        int i = start;
        while(i <= last) {
            list2.add(this.get(i));
            i++;
        }
        return list2;
    }

    @Override
    public SortedSet headSet(Object toElement) {
        SortedSet list3 = new SListSet();
        int to = this.indexOf(toElement);
        int i = 0;
        for(i = 1; i <= to; i++)
            list3.add(this.get(i));
        return list3;
    }

    @Override
    public SortedSet tailSet(Object fromElement) {
        SortedSet list4 = new SListSet();
        int from = this.indexOf(fromElement);
        int end = this.size();
        int i = 0;
        for(i = from; i <= end; i++)
            list4.add(get(i));
        return list4;
    }

    @Override
    public Object first() {
        return this.getFirst();
    }

    @Override
    public Object last() {
        return this.getLast();
    }
}
