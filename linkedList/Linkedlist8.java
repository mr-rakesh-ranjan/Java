/**
 * given a linked list, find the middle node of the linked list
 * I/P : 10->5->15->25->20
 * O/P : 15
 * 
 * I/P : 10->5->25->20
 * O/P : 25
 */
package linkedList;

/**
 * @author rakes
 *
 */
public class Linkedlist8 {
	
	

	public static void printMiddle(Node head) {
		if(head == null)
			return;
		int count = 0;
		Node curr;
		for(curr = head; curr != null; curr=curr.next)
			count++;
		for(int i = 0; i<count/2; i++)
			 curr  = curr.next;
		System.out.println(curr.data);
		
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(25);
		head.next.next.next.next = new Node(20);
		printMiddle(head);

	}

}
