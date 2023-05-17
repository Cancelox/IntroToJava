package PartII;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MathSet<E> extends HashSet<E> {
	
	public MathSet(){
		super();
	}
	
	public Set<E> intersection(Set<E> s2) {
		HashSet<E> ret = (HashSet<E>) this.clone();
		ret.retainAll(s2);
		return ret;

        
    }
    
    public Set<E> union(Set<E> s2) {
    	HashSet<E> ret = (HashSet<E>) this.clone();
    	//System.out.println(this);
		ret.addAll(s2);
		return ret;

    }
    
    public <T> Set<Pair<E,T>> cartesianProduct(Set<T> s2) {
    	HashSet<Pair<E,T>> ret = new HashSet<Pair<E,T>>();
    	Iterator it1 = this.iterator();
    	while(it1.hasNext()) {
    		E temp1 = (E) it1.next();
    		Iterator it2 = s2.iterator();
    		while(it2.hasNext()) {
    			T temp2 = (T) it2.next();
    			Pair<E, T> pair = new Pair<E, T>(temp1, temp2);
    			ret.add(pair);
    		}
    	}
    	return ret;

    }
    

	public static void main(String[] args) {
		// create two MathSet objects of the same type.
		// See if union and intersection works.
		
		// create another MathSet object of a different type
		// calculate the cartesian product of this set with one of the
		// above sets
		MathSet<Integer> s1 = new MathSet<Integer>();
		s1.add(5);
		s1.add(7);
		s1.add(9);
		System.out.println("s1: " + s1);
		MathSet<Integer> s2 = new MathSet<Integer>();
		s2.add(5);
		s2.add(7);
		s2.add(4);
		s2.add(6);
		s2.add(8);
		System.out.println("s2: " + s2);
		System.out.println(s1.intersection(s2));
		System.out.println(s1.union(s2));

		System.out.println(s1.cartesianProduct(s2));
		
	}
}
