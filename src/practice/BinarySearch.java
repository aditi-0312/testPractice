package practice;

public class BinarySearch {

	static int binarysearch(int arr[], int n, int k) {

		int li = 0;
		int hi = arr.length-1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (arr[mi] == k) {
				System.out.println(k  + " at index " + mi);
				//return mi;
				break;
			} else if (arr[mi] < k) {
				li = mi + 1;
			} else if (arr[mi] > k) {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		return mi;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = 5;
		int k = 4;

		binarysearch(arr, n, k);
	}
}
