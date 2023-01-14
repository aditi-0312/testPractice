package practice;

public class KthSmallestElement {
	public static void kthSmallest(int[] arr, int l, int r, int k) {

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] > arr[j]) {
					r = arr[i];
					arr[i] = arr[j];
					arr[j] = r;
				}
			}
		}
		/*for(int i=0;i<l;i++) {
		System.out.println(arr[i]);
		}*/
		System.out.println(arr[k-1]);
		//return arr[k - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int l = arr.length;
		int r = 0;
		int k = 3;
		kthSmallest(arr,l,r,k);
	}

}
