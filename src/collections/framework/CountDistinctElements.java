package collections.framework;

public class CountDistinctElements {

	// Brute Force Aproach
	static int countDistinct(int arr[], int n) {
		int res = 1;

		// Pick all elements one by one
		for (int i = 1; i < n; i++) {
			int j = 0;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;

			// If not printed earlier,
			// then print it
			if (i == j)
				res++;
		}
		return res;
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 2 };
		int n = arr.length;
		System.out.println(countDistinct(arr, n));
	}
}
