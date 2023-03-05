//package LAB08;

import java.util.*;

class ArrayMap<K, V> extends AbstractMap<K,V> {

    ArrayList<ArrayMapEntry> arr = new ArrayList<ArrayMapEntry>();
    public Set entrySet() {
        HashSet<ArrayMapEntry<K,V>> set = new HashSet<ArrayMapEntry<K,V>>();
        int i = 0;
        for(i = 0;i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        return set;
    }

    public int size() {
        return arr.size();
    }
    public V put(K key, V value) {
        int i = 0;
        int ok = 0;
        V exvalue = null;
        for(i = 0; i < arr.size(); i++) {
            ArrayMapEntry aux = arr.get(i);
            if(aux.getKey() == key) {
               exvalue = (V) aux.getValue();
               aux.setValue(value);
               ok = 1;
            }
        }
        if(ok == 1)
            return exvalue;
        else {
            ArrayMapEntry<K,V> actualval = new ArrayMapEntry<>(key,value);
            this.arr.add(actualval);

            return exvalue;
        }
    }

    class ArrayMapEntry<K, V> implements Map.Entry<K,V>{

        private K key;
        private V value;

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
        public boolean equals(Object o) {
            ArrayMapEntry obj = (ArrayMapEntry) o;
            if(obj.key == this.key && obj.value == this.value)
                return true;
            return false;
        }

        public int hashCode() {
            return (this.getKey()==null   ? 0 : this.getKey().hashCode()) ^
                    (this.getValue()==null ? 0 : this.getValue().hashCode());
        }
    }
}