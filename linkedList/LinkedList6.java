/**
 * insertion at given position in singly linked list 
 */
package linkedList;

public class LinkedList6 {
	
	//insert at given position in singly linked list
		public static Node insertPosition(Node head, int pos, int data) {
			Node temp = new Node(data);
			if(pos == 1) {
				temp.next = head;
				return temp;
			}
			Node curr = head;
			for(int i =1; i<= pos-2 && curr != null;i++)
				curr = curr.next;
			if(curr == null)
				return head;
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
		Node head = new Node(2);
		head = insertPosition(head, 2, 60);
		head = insertPosition(head, 2, 99);
		head = insertPosition(head, 2, 45);
		printList(head);
		

	}

}
