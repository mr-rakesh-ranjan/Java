/**
 * Insert data in sorted linked list in sorted manner
 * eg. I/P : 10->20->30->40
 *			 x = 25
 *	   O/P : 10->20->25->30->40 
 * 
 */

package linkedList;

public class LinkedList7 {
	
	//sortInsert function
	public static Node sortInsert(Node head, int x) {
		Node temp = new Node(x);
		if(head == null)
			return temp;
		if(x < head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while(curr.next != null && curr.next.data < x)
			curr = curr.next;
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
	
	//function for printing linked list using iterative solution
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next= new Node(40);
		printList(head);
		System.out.println();
		System.out.println("updated list is -");
		printList(sortInsert(head, 25));
		
		

	}

}
