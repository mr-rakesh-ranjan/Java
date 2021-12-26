
package linkedList;

public class LinkedList3 {
	
	private static Node insertBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		return head;
	}

//	@SuppressWarnings("unused")
	private static void printList(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = insertBegin(head, 30);
		head = insertBegin(head, 80);
		head = insertBegin(head, 20);
		head = insertBegin(head, 10);
		printList(head);
		

	}


}
