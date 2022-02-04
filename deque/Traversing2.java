// Traverse the Dequeue from Last to first
package deque;
import java.util.*;
import java.util.Deque;
public class Traversing2 {

	public static void main(String[] args) {
		Deque <Integer> d = new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		
		@SuppressWarnings("rawtypes")
		Iterator it = d.descendingIterator();
		while(it.hasNext())
			System.out.print(it.next()+ " ");
		System.out.println();
		
	}

}
