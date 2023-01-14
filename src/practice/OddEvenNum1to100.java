package practice;

public class OddEvenNum1to100 {
	public static void main(String[] args) {
		System.out.print("Odd numbers from 1 to 100 are = ");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}
}
