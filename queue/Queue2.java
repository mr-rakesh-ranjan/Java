//Linked list implementation of Queue


package queue;

/**
 * @author rakes
 *
 */
class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}

public class Queue2 {
	Node front, rear;
	int size;
	Queue2(){
		front = rear = null;
		size = 0;
	}
	
	//function for enque
	void enque(int x) {
		Node temp = new Node(x);
		size++;
		if(front == null) {
			front = rear = temp;
			return;
		}
		rear.next=temp;
		rear = temp;
	}
	
	//function for deque
	void deque() {
		if(front == null)
			return ;
		size--;
		front = front.next;
		if(front == null)
			rear = null;
	}
	
	//display function for queue
	void display() {
		Node curr = front;
		while(curr != null) {
			System.out.print(curr.data  + " ");
			curr = curr.next;
		}
	}
	public static void main(String[] args) {
		Queue2 q = new Queue2();
		q.enque(5);
		q.enque(78);
		q.enque(89);
		q.display();
		

	}

}
