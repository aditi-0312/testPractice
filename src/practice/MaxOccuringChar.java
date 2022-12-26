package practice;

public class MaxOccuringChar {
	public static void main(String[] args) {
		String str = "abbccc";
		
		int[] freq = new int[str.length()];
		int visited = -1;

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;

					freq[j] = visited;
				}
			}

			if (freq[i] != visited) {
				freq[i] = count;
			}
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println("    " + str.charAt(i) + "    |    " + freq[i]);
		}
	}
}
