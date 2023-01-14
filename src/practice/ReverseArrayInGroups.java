package practice;

public class ReverseArrayInGroups {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int k = 3;

		for (int i = 0; i < n; i = i + k) {
			int left = i;
			int right = Math.min(i + k - 1, arr.length - 1);
			int temp;

			while (left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
