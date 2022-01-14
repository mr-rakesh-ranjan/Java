package pack1;
import java.util.Scanner;

public class MyArray {
	int [] arr;
	int size;
	MyArray(int c){
		arr = new int [c];
		size = c;
	}
	public int[] takingInput(int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of arr");
		int [] a = new int [size];
		for(int i = 0; i<size; i++)
			a[i] = sc.nextInt();
		sc.close();
		return a;
	}	
}
