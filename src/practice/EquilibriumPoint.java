package practice;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] a= {1,3,5,2,2};
		int mid=a.length/2;
		int sumR=0;
		int sumL=0;
		
		int[] left=new int[mid];
		int[] right=new int[a.length-mid-1];
		
		for(int i=0;i<mid;i++) {
			left[i]=a[i];
		}
		
		for(int i=mid+1;i<right.length;i++) {
			right[i-mid]=a[i];
		}
		
		//sum(left);
		//sum2(right);
		
		if(sumR==sumL)
			System.out.println(mid);
		else
			System.out.println("try again");
	}

	private static int sum2(int[] right,int sumR) {
		//int sumR=0;
		for(int i=0;i<right.length;i++)
		sumR=sumR+right[i];
		return sumR;
	}

	private static int sum(int[] left,int sumL) {
		//int sumL=0;
		for(int i=0;i<left.length;i++)
		sumL=sumL+left[i];
		return sumL;
	}

}
