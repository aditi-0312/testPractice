package practice;

public class HollowPattern {
	static int n = 5;

	public static void main(String[] args) {
		letterH();

	}

	private static void letterH() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == n / 2 + 1) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
