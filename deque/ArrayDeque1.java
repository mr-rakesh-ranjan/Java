//ArrayDeque as Stack
package deque;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque <Integer> ad = new ArrayDeque<Integer>();
		ad.push(10);
		ad.push(20);
		System.out.println(ad.peek());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		ad.push(40);
		System.out.println(ad.pop());

	}

}
