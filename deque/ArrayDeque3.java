//arrayDeque as Dequeue
package deque;

import java.util.ArrayDeque;

public class ArrayDeque3 {

	public static void main(String[] args) {
		ArrayDeque <Integer> ad = new ArrayDeque <Integer>();
		ad.offerFirst(10);
		ad.offerLast(20);
		ad.offerFirst(30);
		ad.offerLast(40);
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad.pollLast());

	}

}
