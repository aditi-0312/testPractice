package practice;

public class Equilibrium_Point {

	public static void main(String[] args) {
		long[] a = {1,3,5,2,2};
		int n = a.length;
		int ans=equilbriumPoint(a, n);
		System.out.println(ans);
	}

	private static int equilbriumPoint(long[] a, int n) {
		int mid = (0 + n - 1) / 2;

		while (n > 1) {
			int sl = 0;
			int sr = 0;
			for (int i = 0; i < mid; i++) {
				sl += a[i];
			}
			for (int i = mid + 1; i < a.length; i++) {
				sr += a[i];
			}
			if (sr == sl)
				break;
			else {
				if (sl > sr)
					mid = mid - 1;
				else
					mid = mid + 1;
			}
		}
		return mid;
	}

}
