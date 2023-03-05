import java.util.*;

public class ArrayMap<K,V> extends AbstractMap<K,V> {
    Vector<K> key;
    Vector<V> values;

    public ArrayMap() {
        key = new Vector();
        values = new Vector();
    }

    public String toString() {


    }

    public V put(K key, V value) {
        this.key.add(key);
        this.values.add(value);
        return value;
    }

    public V get(Object o) {
        K key = (K) o;
        V value = null;
        if(this.key.contains(key)){
            value = this.values.get(this.key.indexOf(key));
        }
        return value;
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<K>(key);
        return set;
    }

    public Collection<V> values() {
        return values;
    }

    public Set<Map.Entry<K, V>> entrySet(){
        Set<Map.Entry<K,V>> set = new HashSet<>();
        int i = 0;
        for(i = 0; i < key.size(); i++) {
            set.add(new Entry<>(key.get(i), values.get(i)));
        }
        return set;
    }

    class Entry<K, V> implements Map.Entry<K, V> {

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {

            return key;
        }

        public V getValue() {

            return value;
        }

        public V setValue(V value) {
            V value1 = this.value;
            this.value = value;
            return value1;
        }

        public String toString() {
            return "KEY: " + key + " " + "Value: " + value;
        }
    }
}
