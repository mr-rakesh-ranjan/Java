package deque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class Traversing1 {

	public static void main(String[] args) {
		Deque <Integer> d = new LinkedList<Integer>();
		d.addFirst(10);
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		
		//one way of traversing from first to last
		@SuppressWarnings("rawtypes")
		Iterator it = d.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		
		//other way to traversing from first to last
		for(int x : d)
			System.out.print(x + " ");
		System.out.println();

	}

}
