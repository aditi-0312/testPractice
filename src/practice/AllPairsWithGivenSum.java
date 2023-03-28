package practice;

import java.util.ArrayList;

public class AllPairsWithGivenSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 7 };
		int[] b = { 5, 6, 3, 4, 8 };
		int sum = 9;
		allPairs(a, b, sum);
		//System.out.println(result.toString());
	}

	private static pair[] allPairs(int[] a, int[] b, int sum) {
		ArrayList<pair> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] + b[j] == sum) {
					pair p=new pair(a[i],b[j]);
					list.add(p);
				}
				}
			}
		pair[] ans = new pair[list.size()];
	    ans = list.toArray(ans);
	    return ans;
		
		}

	}


