package LAB3;

public class MyQueue {
	private MyArray array;
	private static final int a = 9500;
	private int first, last, nr;
	
//	public MyQueue(MyArray array, int a, int first, int last, int nr) {
//		this.array = array;
//		//this.a = a;
//		this.first = first;
//		this.last = last;
//		this.nr = nr;
//	}
	
	public MyQueue() {
		this.array = new MyArray(a);
		//this.a = a;
		this.first = -1;
		this.last = -1;
		this.nr = 0;
	}
	
	public int getSize() {
        return nr;
	}
	
	public void enqueue(int value) {
	     if(nr == 0){
	          first = last = 0;
	          nr++;
	          array.set(last, value);
	      } else {
	    	  last++;
	    	  nr++;
	    	  array.set(last, value);
	      }
	  }
	public boolean isEmpty() {
	      if(nr == 0){
	          return true;
	      } else {
	          return false;
	      }
	  }
	
	public int dequeue() {
	    	  int x = array.get(first);
	          first++;
	          return x;
	  }
	
	public String toString() {
		int i;
	    String s = new String();
	       for(i = 0; i < array.getSize(); i++){
	             s = s + array.get(i);
	          }
	      return s;
	}
	
	public static void main(String args[]) {
	        MyQueue queue = new MyQueue();
	        queue.enqueue(7);
	        queue.enqueue(8);
	        queue.enqueue(10);
	        queue.enqueue(-1);
	        queue.enqueue(2);
	        System.out.println(queue);
	        System.out.println(queue.dequeue());
	        System.out.println(queue.getSize());
	        System.out.println(queue);
	        queue.enqueue(9);
	        queue.enqueue(queue.dequeue());
	        queue.enqueue(11);
	        queue.enqueue(22);
	        System.out.println(queue);
	        while(!queue.isEmpty()) {
	            System.out.print(queue.dequeue() + " ");
	        }
	        System.out.println("");
	        System.out.println(queue);
	    }
	
}

class MyArray {
    private int v[];
    private int size;
    
 
    public MyArray() {
        this(100);
    }
 
    public MyArray(int length) {
        size = 0;
        v = new int[length];
    }
 
    public int get(int poz) {
        if(poz < size) {
            return v[poz];
        } else {
            return -1;
        }
    }
 
    public void set(int pos, int value) {
        v[pos] = value;
        size++;
    }
 
    public int getSize() {
        return size;
    }
}
 
 
//class Test {
//    public static void main(String args[]) {
//        MyQueue queue = new MyQueue();
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.enqueue(10);
//        queue.enqueue(-1);
//        queue.enqueue(2);
//        System.out.println(queue);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.getSize());
//        System.out.println(queue);
//        queue.enqueue(9);
//        queue.enqueue(queue.dequeue());
//        queue.enqueue(11);
//        queue.enqueue(22);
//        System.out.println(queue);
//        while(!queue.isEmpty()) {
//            System.out.print(queue.dequeue() + " ");
//        }
//        System.out.println("");
//        System.out.println(queue);
//    }
//}
