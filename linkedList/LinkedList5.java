/**
 * Implementation of linked list function
 * 
 */
package linkedList;

//import java.util.Scanner;

/**
 * @author rakes
 *
 */
public class LinkedList5 {
	
	
	// Function for "Delete first Node in a singly linked list".
	public static Node delHead(Node head) {
		if(head == null)
			return null;
		else
			return head.next;
	}
	
	//function for "Delete last Node in singly linked List"
	public static Node delTail(Node head) {
		if(head == null)
			return null;
		if(head.next == null)
			return null;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
			curr.next = null;
		}
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
		System.out.println("List after deleting head Node");
		printList(delHead(head));
		System.out.println();
		System.out.println("List after deleting tail node");
		printList(delTail(head));
	}

}
