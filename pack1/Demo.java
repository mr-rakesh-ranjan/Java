package pack1;

public  class Demo implements Sort_Search{
	
	public void insertionSort(int [] z, int size) {
		 int i, key, j; 
		    for (i = 1; i < size; i++)
		    { 
		        key = z[i]; 
		        j = i - 1; 

		        while (j >= 0 && z[j] > key)
		        { 
		            z[j + 1] = z[j]; 
		            j = j - 1; 
		        } 
		        z[j + 1] = key; 
		    } 
		    System.out.print("The Sorted array is ");
		    for(int x = 0; x<size; x++)
		    	System.out.print(z[x] + " ");
	}
	
	public void linearSearch(int [] z, int size, int item) {
		for(int i = 0; i < size; i++) {
			if(z[i] == item)
				System.out.println("The required Index is " + i);
		}
		
	}

	public static void main(String[] args) {
		MyArray  a1 = new MyArray(5);
		int [] a = a1.takingInput(5);
		Demo d1 = new Demo();
		d1.linearSearch(a, 5, 6); 
		d1.insertionSort(a, 5);
	}

}
