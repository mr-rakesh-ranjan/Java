// Searching in Linked List Iterative and Recursive 


package linkedList;

public class LinkedList2 {
	
	//function for search in linked list using Iterative approach
	public static int search(Node head, int x) {
		int pos = 1;
		Node curr = head;
		while(curr != null) {
			if(curr.data == x)
				return pos;
			else {
				pos ++;
				curr = curr.next;
			}
		}
		return -1;
	}
	
	//function for search in linked list using recursive solution
	public static int rSearch(Node head, int x) {
		if(head == null)
			return -1;
		if(head.data == x)
			return 1;
		else {
			int res = rSearch(head.next, x);
			if(res == -1)
				return -1;
			else
				return (res + 1);
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		System.out.println("Searching through iteration " + search(head,40));
		System.out.println("Searching through recursion " + rSearch(head,20));
		

	}

}
