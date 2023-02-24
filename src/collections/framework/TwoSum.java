package collections.framework;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	//BruteForce Implementation
	/*public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return nums;
	}*/
	
	//Map Implementation using Hashing technique
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> complements = new HashMap<>();
		int [] res=new int[2];
		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]);
			if(complementIndex!=null) {
				res[0]=i;
				res[1]=complementIndex;
				//return new int[] {i, complementIndex};
			}
			complements.put(target - nums[i], i);
			}
		return res;
		}

	public static void main(String[] args) {
		int[] nums = { 5, 2, 4 };
		int target = 6;
		int[] arr=twoSum(nums, target);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
	}

}
