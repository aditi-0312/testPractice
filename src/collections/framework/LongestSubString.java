package collections.framework;

import java.util.HashMap;

public class LongestSubString {

//Brute Force Method
	/*
	 * public static int lengthOfLongestSubstring(String s) { int maxLength = 0;
	 * StringBuilder currentSubstring = new StringBuilder(); for (int i = 0; i <
	 * s.length(); i++) { //StringBuilder currentSubstring = new StringBuilder();
	 * for (int j = i; j < s.length(); j++) { if
	 * (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) { break; }
	 * currentSubstring.append(s.charAt(j));
	 * maxLength=Math.max(currentSubstring.length(), maxLength );
	 * 
	 * } } return maxLength; //return currentSubstring; }
	 */

	// HashMap Implementation (Sliding Window Algorithm)
	/*
	 * public static int lengthOfLongestSubstring(String s) { int maxLength = 0;
	 * 
	 * HashMap<Character, Integer> visitedCharacters = new HashMap<>();
	 * 
	 * for (int right = 0, left = 0; right < s.length(); right++) { char
	 * currentCharacter = s.charAt(right);
	 * 
	 * if (visitedCharacters.containsKey(currentCharacter) &&
	 * visitedCharacters.get(currentCharacter) >= left) { left =
	 * visitedCharacters.get(currentCharacter) + 1; } maxLength=Math.max(maxLength,
	 * right-left+1); visitedCharacters.put(currentCharacter, right); } return
	 * maxLength; // return currentSubstring; }
	 */

	public static int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		for (int right = 0, left = 0; right < s.length(); right++) {

			int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
			if (indexOfFirstAppearanceInSubstring != right) {
				left = indexOfFirstAppearanceInSubstring + 1;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		String s = "abcabcd";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
