import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {

   Comparator comparator = null;
    public Catalog(Comparator comparator) {
        if(comparator != null)
            this.comparator = comparator;
    }

    public Catalog(){
        this(null);
    }

    public void addStudent(String name, double media, int clazz){

        add(this.new Student(name, media, clazz));
    }

    public Student getStudent(String name){
        Iterator i = this.iterator();

        while(i.hasNext()) {
            Student dani = (Student) i.next();
            if(dani.getName() == name) return dani;
        }
        return null;
    }

    public void removeStudent(String name) {
        for (Student s : this) {
            if (s.name.equals(name)) {
                remove(s);
                return;
            }
        }
    }

    public Catalog byClass(int clazz) {
        Catalog catalog = new Catalog();
        for(Student s : this ){
            if(s.clazz == clazz) {
                catalog.addStudent(s.name, s.media, s.clazz);
            }
        }
        return catalog;
    }

    class Student implements Comparable {
        public String name;
        public double media;
        public int clazz;

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        public Student(){
            this("", 0,0);
        }
        public String getName(){
            return this.name;
        }

        public int getClazz(){
            return this.clazz;
        }

        public double getMedia(){
            return this.media;
        }

        @Override
        public int compareTo(Object o) {
            Student andi = (Student) o;
            Double d1 = media;
            Double d2 = andi.media;
            if(d1.compareTo(d2) == 0) {
                return name.compareTo(andi.name);
            }
            if(d1.compareTo(d2) < 0) {
                return -1;
            }
            return 1;
        }
        public String toString(){
            return name + " se afla in clasa " + clazz + " si are media " + media + ".";
        }

    }

}
