//Implementation dequeue using dequeue class of java 
package deque;
import java.util.*;
import java.util.Deque;

public class Impementation1 {

	public static void main(String[] args) {
		Deque <Integer> d = new LinkedList<Integer>();
		d.offerFirst(10);
		d.offerLast(20);
		d.offerFirst(5);
		d.offerLast(15);
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		d.pollFirst();
		d.pollLast();
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
	}

}
