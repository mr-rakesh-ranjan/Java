//Initialization of object through function

package objectOrientedProgramming;

public class Animal1 {
	String color;
	int age;
	
	void initObj(String c, int a) {
		color = c;
		age = a;
	}
	
	void display() {
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 buzo = new Animal1();
		buzo.initObj("black", 4);
		buzo.display();
		}

}
