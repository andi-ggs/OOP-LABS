import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)) return true;
        return super.add(o);
    }

    public void add(int i, Object o){
        if(this.contains(o)) return;
        if(i - this.size() == 1){
            super.addLast(o);
        }
        if(i == 0) {
            super.addFirst(o);
        }
        super.add(i,o);
    }

    public Object set(int i, Object o){
        if(this.contains(o)) return -1;
        if(i >= this.size()) return -1;
        if(i < 0) return -1;

        if(i == 0) {
            super.remove(i);
            super.addFirst(o);
            return super.get(i);
        }

        if(i == this.size() - 1) {
            super.remove(i);
            super.addLast(o);
            return super.get(i);
        }
        super.set(i,o);
        return super.get(i-1);
    }
}
