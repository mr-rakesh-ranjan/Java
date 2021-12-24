package array;

import java.util.Scanner;

public class Array1 {
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
        printArr(arr);
        sc.close();
    }
    

}
