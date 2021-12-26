/**
 * Implementation of linked list function
 * 
 */
package linkedList;

import java.util.Scanner;

/**
 * @author rakes
 *
 */
public class LinkedList5 {
	
	// function for insert at the end
	public static Node insertEnd(Node head, int x){
		Node temp = new Node(x);
		if(head == null)
			return temp;
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}
	
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
		while(curr.next != null)
			curr = curr.next;
		curr.next = null;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of linked list");
		int l = sc.nextInt();
		Node head = null;
		for(int i = 1; i<=l; i++) {
			System.out.println("Enter the " + i + " element of your Linked List");
			int n = sc.nextInt();
			head = insertEnd(head, n);
		}
		sc.close();
		System.out.println("Your linked list is ");
		printList(head);
		delHead(head);
		System.out.println();
		System.out.println("your list after the deletion of head node");
		printList(delHead(head));
		
		
		

	}

}
