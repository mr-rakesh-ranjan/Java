//Insertion of new node at the end of Linked List

package linkedList;

import java.util.Scanner;


public class LinkedList4 {
	
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
	
	/**
	 * Note the function Insert at end is also helping in taking input through user in linked list
	 */
	
	
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
		System.out.println("your list");
		printList(head);
	}

}
