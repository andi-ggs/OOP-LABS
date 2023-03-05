package LAB7;

import java.util.LinkedList;
import java.util.Set;

public class LinkedSet extends LinkedList implements Set {
    public boolean add(Object obj){
        if(this.contains(obj)) return true;
        addLast(obj);
        return false;
    }
    public void add(int i, Object obj){

        if(this.contains(obj)) return;
        super.add(i,obj);

    }
    public Object set(int i, Object obj){

        if(this.contains(obj)) return obj;
        System.out.println(this.size());
        if(i >= this.size())
            super.addLast(obj);

        else super.set(i,obj);

        while(this.indexOf(obj) != this.lastIndexOf(obj))
            removeFirstOccurrence(obj);
        //??????

        return obj;
    }
}
