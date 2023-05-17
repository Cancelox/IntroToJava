package PartI;
import java.util.ArrayList;


public class MyStack<E> {

	private ArrayList<E> ar = new ArrayList<E>();
	
	public boolean empty() {
		return ar.isEmpty();
	}
	
	public E peek() {
		return ar.get(ar.size()-1);
	}
	
	public E pop() {
		return ar.remove(ar.size()-1);
	}
	
	public E push(E item) {
		ar.add(item);
		return item;
	}
	
	public int search(Object o) {
		//int ret = ar.indexOf(o);
		//if(ret == -1) return ret;
		//else return ret+1;
		return ar.indexOf(o);
		
	}
}
