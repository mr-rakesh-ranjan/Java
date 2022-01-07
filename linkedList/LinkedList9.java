/**
  * Q. Find nth Node from end of linked list
 */
package linkedList;

/**
 * @author rakes
 *
 */
public class LinkedList9 {

	/**
	 * @param args
	 */
	
	//Using length of linked List
	public static void printNthFromEnd(Node head, int n) {
		int len = 0;
		for(Node curr = head; curr != null; curr = curr.next)
			len++;
		if(len<n)
			return;
		Node curr = head;
		for(int i =0;i<len-n;i++)
			curr = curr.next;
		System.out.println(curr.data);
	}
	
	//Using Two pointer/Reference
	/**
	 * 10->20->30->40->50->60  && n =  2
	 * O/P : 50
	 * 
	 * 
	 * Steps 1 : move 'first' n position a head
	 * 		 2 : start 'second' pointer from head
	 * 		 3 : move both 'first' and 'second' reach null same speed when 'first' reaches null, 'second' reaches the required node. 
	 */
	
	public static void printNthfromEnd(Node head, int n) {
		if(head == null)
			return;
		Node first = head;
		for(int i = 0; i < n; i++) {
			if(first == null)
				return;
			first = first.next;
		}
		Node second = head;
		while(first != null) {
			second = second.next;
			first = first.next;
		}
		System.out.println(second.data);
	}
	public static void main(String[] args) {
		Node temp = new Node(10);
		temp.next = new Node(20);
		temp.next.next = new Node(30);
		temp.next.next.next = new Node(40);
		printNthFromEnd(temp,1);
		printNthfromEnd(temp,2);

	}

}
