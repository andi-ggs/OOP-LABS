import java.util.Map;
import java.util.Vector;

class ArrayMapEntry<K, V> implements Map.Entry<K,V>{

    private Vector keys = new Vector();
    private Vector values = new Vector();

    public ArrayMapEntry(K key, V value) {
        this.key=key;
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
    public String toString(){

        return "KEY: " + key + " " + "Value: " + value;
    }
}
