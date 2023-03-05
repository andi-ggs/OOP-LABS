package LAB4;

import java.util.Collections;
import java.util.Vector;

class Array {
    //Vectorul in care se vor retine elementele
    private Vector<Integer> vector;
 
    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }
 
    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }
 
    //Metoda care adauga un element in vector, tinand cont de pozitia indicata -- Neindicata in cazul sortarii unui vector
   public void addElement(Integer x, int poz) {
    	vector.add(poz, x);
    }
   
 
    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }
 
    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }
 
    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }
 
    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }
 
    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }
 
    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {
		
		public void addElement(Integer x) {
			
			super.addElement(x);
			sort();
	    }
	}

class MyStack {
	
	private Array vector;
	private int top;
	
	public MyStack() {
		this.top = -1;
		this.vector = new Array();
	}
	
	
	public void push(Integer x) {
		vector.addElement(x, 0);
		top++;
	}
	
	public int pop() {
		int x = vector.get(top);
		--top;
		return x;
	}
	public String toString() {
		String result = "Stack:";
		for(int i = 0; i <= top; i++)
		{
			result += vector.get(i) + "-> ";
		}
		return result;
	}
	
}

public class MyArrayMyStack {
	public static void main(String args[]) {
		SortedArray array = new SortedArray();
		array.addElement(9);
		array.addElement(4);
		array.addElement(3);
		array.addElement(7);
		array.addElement(1);
		System.out.println(array);
		MyStack stack = new MyStack();
		stack.push(8);
		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.push(6);
		stack.push(9);
		System.out.println(stack);
		System.out.println("Last in " + stack.pop());
		System.out.println("Last in " +stack.pop());
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		System.out.println("Last in " + stack.pop());
		
	}
}
