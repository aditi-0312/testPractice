package practice;

public class LeftRotateArrayElements {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5};
		int temp=0;
		
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
