package introduction;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =  sc.next();
		if(n<27 && n >= 1){
			System.out.println("this is integer");
		}
		if(s == "") {
			System.out.println("this is string");
		} 

	}

}
