package skicorp;

public class Question1 {
	static void print(int n)
    {
        int var1 = 1, var2 = 1;
     
        // Outer for loop to keep
        // track of number of lines
        for (int i = 0; i < n; i++)
        {
            // for loop to keep track
            // of spaces
            for (int j = n - 1; j > i; j--)
            {
                System.out.print(" ");
            }
     
            // for loop to print the
            // digits in pattern
            for (int k = 1; k <= var1; k++)
            {
                System.out.print(Math.abs(k - var2));
            }
     
            var1 += 2;
            var2++;
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	     
	        // function calling
	        print(n);

	}

}
