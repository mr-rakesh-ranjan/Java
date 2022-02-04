package labExam;

public class QuestionB {
	public static void insertionSort(int [] arr) {
		int n = arr.length;
	    for (int i = 1; i < n; ++i) {
	        int key = arr[i];
	        int j = i - 1;
	        
	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	    }
	}
	static void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
	public static void main(String[] args) {
		int [] arr = {23, 45,62,12,34,11};
		insertionSort(arr);
		printArray(arr);
	}
}

