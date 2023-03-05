import java.util.Iterator;

public class LinkedList<T> implements Iterable{

    private class Node<T> {
        Node<T> next;
        T data;

        public Node(T data, Node<T> next){
            this.data = data;

            if (next != null) {
                this.next = next;
            } else {
                this.next = null;
            }
        }

        public Node(T data) {
            this(data, null);
        }
    }

    class ListIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>();
    }

    Node<T> first = null;
    Node<T> last;

    public void addFirst(T data) {
        Node<T> oldFirst = first;
        first = new Node<T>(data, oldFirst);
    }

    /* Adauga nod la sfarsitul listei */
    public void add(T data) {
        Node<T> oldLast = last;
        last = new Node<T>(data);
        //oldLast.next = last;
    }
}
