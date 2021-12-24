package array;

import java.util.Scanner;

public class ReverseTheArray {

	//function for reverse the array
	static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
	}
	
	//function for print the array
	static void printArr(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int l = sc.nextInt(); 
        int arr [] = new int[l];
        // taking input
        for(int i =0; i<arr.length;i++){
            System.out.print("Enter the " + i+ " element of array");
            arr[i] = sc.nextInt();
        }
        sc.close();
        printArr(arr);
        System.out.println();
        reverseArray(arr);
        System.out.println("The reverse array is ");
        printArr(arr);

	}

}
