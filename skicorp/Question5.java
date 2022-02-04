package skicorp;

class Map{
	int value, key;
	Map(int value, int key){
		this.value = value;
		this.key = key;
	}
	
	public void display() {
		System.out.println(value +" & " + key);
	}
	
	
}


public class Question5 {

	public static void main(String[] args) {
		Map m1 = new Map(2,3);
		m1.display();
		
		
		

	}

}
