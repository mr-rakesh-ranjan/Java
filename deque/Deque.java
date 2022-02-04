//This is the simple implementation of Dequeue 
package deque;

public class Deque {
	int size, cap;
	int [] arr;
	Deque(int c){
		cap = c;
		size = 0;
		arr = new int [cap];
	}
	
	//isFull function 
	public boolean isFull() {
		return (size == cap);
	}
	
	//isEmpty function 
	public boolean isEmpty() {
		return (size == 0);
	}
	
	//Insert an item at the end of the dequeue
	public void insertRear(int x) {
		if(isFull())
			return;
		arr[size] = x;
		size++;
	}
	
	//Insert an item at the front of the dequeue
	public void insertFront(int x) {
		if(isFull())
			return;
		for(int i = size-1; i >= 0; i--)
			arr[i+1] = arr[i];
		arr[0] = x;
		size++;
	}
	
	//Delete an item from end
	void deleteRear() {
		if(isEmpty())
			return;
		size--;
	}
	
	//Delete an item from first of Dequeue
	void deleteFront() {
		if(isEmpty())
			return;
		for(int i = 0; i < size-1; i++)
			arr[i] = arr[i+1];
		size--;
	}
	
	//Function for getting an element from end of the dequeue;
	public int getRear() {
		if(isEmpty())
			return -1;
		else
			return arr[size-1];
	}
	
	//Function for getting an element from front of the dequeue
	public int  getFront() {
		if(isEmpty())
			return -1;
		else 
			return arr[0];
	}
	

	public static void main(String[] args) {
		Deque d = new Deque(5);
		d.insertFront(10);
		d.insertRear(20);
		d.insertFront(5);
		System.out.println(d.getRear());
		d.deleteFront();
		System.out.println(d.getFront());
		}
}
