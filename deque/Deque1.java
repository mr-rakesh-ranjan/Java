// Effective solution of Dequeue
package deque;

public class Deque1 {
	int [] arr;
	int front, cap, size;
	Deque1(int c){
		arr = new int[c];
		front = 0;
		size = 0;
	}
	
	// isEmpty function declaration
	private boolean isEmpty() {
		return size == 0;
	}
	//isFull function declaration
	private boolean  isFull() {
		return (size == cap);
	}
		
	//function for delete an item from end of the dequeue
	public void deleteRear() {
		if(isEmpty())
			return;
		size--;
	}
	
	//function for delete an item from first of the dequeue 
	public void deleteFront() {
		if(isFull())
			return ;
		front = (front-1)%cap;
		size--;
	}
	
	//function for insert an element at first of the dequeue
	public void insertFront(int x) {
		if(isFull())
			return ;
		front = (front+cap-1)%cap;
		arr[front] = x;
		size++;
	}
	
	//function for insert an element at end of the dequeue
	public void insertRear(int x) {
		if(isFull())
			return;
		int new_rear = (front+size)%cap;
		arr[new_rear] = x;
		size++;
	}
	
	//function for get element at first of the dequeue
	public int getFront() {
		if(isEmpty())
			return -1;
		else
			return arr[front];
	}
	
	//function for get an element at end of the dequeue
	public int getRear() {
		if(isEmpty())
			return -1;
		else
			return arr[(front+size-1)%cap];
	}
		
	public static void main(String[] args) {
		Deque1 d = new Deque1(5);
		d.insertFront(10);
		d.insertRear(20);
		d.insertRear(4);
		System.out.println(d.getRear());
		System.out.println(d.getFront());

	}

}
