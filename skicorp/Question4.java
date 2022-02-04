package skicorp;

public class Question4 {
	static void print(int arr[], int n)
    {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next +","  );
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11, 13, 21, 3};
        int n = arr.length;
        print(arr, n);
	}

}
