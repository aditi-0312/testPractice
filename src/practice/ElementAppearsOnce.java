package practice;

import java.util.Arrays;

public class ElementAppearsOnce {

	public static int findOnce(int[] a) {
		int n = a.length;
		

			if (n == 1)
				return a[0];
			else if (a[0] != a[1])
				return a[0];
			else if (a[n - 1] != a[n - 2])
				return a[n - 1];
			
			
			int lo = 0;
			int hi = n - 1;

			while (lo <= hi) {
				int mid = (lo + hi) / 2;
				
				if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1]) {
					return a[mid];
				}
				else if(a[mid]==a[mid-1]) {
					//lo to mid elements count
					int lc=mid-lo+1;
					
					if(lc%2==0)
						lo=mid+1;
					else
						hi=mid-2;
				}
				else if(a[mid]==a[mid+1]) {
					//mid to hi elements count
					int rc=mid-lo+1;
					
					if(rc%2==0)
						hi=mid-1;
					else
						lo=mid+2;
				}
		}
			return 0;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 1, 6, 6, 6 };
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		
		System.out.println(findOnce(a));

//		for(int i=0;i<a.length;i++) {
//			int count=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=-1;
//				}
//			}
//			if(count==1&&a[i]!=-1) {
//				System.out.println(a[i]);
//			}
//		}
//		System.out.println(a.length);

	}

}
