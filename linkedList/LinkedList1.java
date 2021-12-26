// Traversing a singly linked list 

package linkedList;

class Node {
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}

public class LinkedList1 {
	
	//function for printing linked list using iterative solution
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
	//function for printing linked list using recursive solution
	public static void recursivePrint(Node head) {
		if(head == null)
			return;
		System.out.print(head.data+ " ");
		recursivePrint(head.next);
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		System.out.println("Print through ilteration solution" );
		printList(head);
		System.out.println();
		System.out.println("Print through recursion solution" );
		recursivePrint(head);
	}
}
