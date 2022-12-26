package practice;

public class SubsetsOfString {

	public static void main(String[] args) {
		String s = "TUG";
		int len = s.length();

		String[] subSets = new String[len * (len + 1) / 2];
		int temp = 0;

		for (int i = 0; i < len; i++) {

			for (int j = i; j < len; j++) {
				subSets[temp] = s.substring(i, j + 1);
				temp++;
			}
		}

		for (int i = 0; i < subSets.length; i++) {
			System.out.println(subSets[i]);
		}

	}

}
