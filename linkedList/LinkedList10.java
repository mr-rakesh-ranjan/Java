//Reverse the linkedlist 

package linkedList;
import java.util.ArrayList;

public class LinkedList10 {
	
	//function for reverse the list
	public static Node reverse(Node head) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(Node curr = head; curr!=null;curr=curr.next)
			arr.add(curr.data);
		for(Node curr = head; curr != null; curr = curr.next)
			curr.data = arr.remove(arr.size()-1);
		return head;
	}
	
	// effective solution for reverse the linked list
	public static Node eReverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	//recursive solution for reverse the linked list
//	@SuppressWarnings("null")
	public static Node recReverse(Node head) {
		if(head == null && head.next == null)
			return head;
		Node rest_head = recReverse(head.next);
		Node rest_tail = head.next;
		rest_tail.next = head;
		head.next = null;
		return rest_head;
	}
	
	//function for printing linked list using iterative solution
	public static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		printList(head);
		System.out.println();
		printList(recReverse(head));

	}

}
