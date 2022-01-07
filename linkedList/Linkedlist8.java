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
	
	
	//Naive solution for printing middle node of given linked list
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
	
	//Efficient solution for printing middle node of given linked list
	public static void printMid(Node head) {
		if(head == null)
			return;
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(25);
		head.next.next.next.next = new Node(20);
		printMid(head);

	}

}
