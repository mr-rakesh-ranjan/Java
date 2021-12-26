//Implementation of Queue using Array

package queue;

public class Queue1 {
	int  [] arr;
	int front, cap, size, rear;
	Queue1(int c){
		arr = new int[c];
		cap = c;
		front = 0;
		size= 0;
		rear = cap -1;
	}
	
	//deque function
	 void deque() {
		if(isEmpty())
			return;
		front = (front +1)%cap;
		size--;
	}
	 
	 //enque function
	 void enque(int x) {
		 if(isFull())
			 return ;
		 rear = (front + size-1)%cap;
		 rear = (rear +1)% cap;
		 arr[rear] = x;
		 size++;
	 }
	 
	 // getRear() function
	 int getRear() {
		 if(isEmpty())
			 return -1;
		 else
			 return (front+size-1)%cap;
	 }
	 
	 //getFront() function
	 int getFront() {
		 if(isEmpty())
			 return -1;
		 else 
			 return front;
	 }
	 
	 //display functions
	 void display() {
		 for(int i = front; i<=rear;i++)
			 System.out.print(arr[i]+ " ");
	 }
	 
	 //isFull function
	 boolean isFull() {
		 return (cap == size);
	 }
	//IsEmpty function
	 boolean isEmpty() {
		return (cap == 0);
	}

	public static void main(String[] args) {
		 Queue1 q1 = new Queue1(10);
		 q1.enque(5);
		 q1.enque(9);
		 q1.enque(6);
		 q1.deque();
		 
		 
		 
		
		 System.out.println(q1.isEmpty());
		 System.out.println(q1.isFull());
		 System.out.println(q1.getFront());
		 System.out.println( q1.getRear());
		 q1.display();
		 System.out.println();
		 

		
	}

}
