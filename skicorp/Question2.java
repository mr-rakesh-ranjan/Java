package skicorp;

public class Question2 {
	public static int subArray(int arr[], int n)
	    {
	        int sum = 0;
	        int maxsize = -1, sindex = 0;
	        int eindex = 0;
	 
	        // Pick a starting point as i
	 
	        for (int i = 0; i < n - 1; i++) {
	            sum = (arr[i] == 0) ? -1 : 1;
	 
	            // Consider all subarrays starting from i
	 
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] == 0)
	                    sum += -1;
	                else
	                    sum += 1;
	 
	                // If this is a 0 sum subarray, then
	                // compare it with maximum size subarray
	                // calculated so far
	 
	                if (sum == 0 && maxsize < j - i + 1) {
	                    maxsize = j - i + 1;
	                    sindex = i;
	                }
	            }
	        }
	        eindex = sindex + maxsize - 1;
	        if (maxsize == -1)
	            System.out.println("No such subarray");
	        else
	            System.out.println(sindex + " to " + eindex);
	 
	        return maxsize;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
        int size = arr.length;
 
        
        System.out.println(subArray(arr, size));

	}

}
