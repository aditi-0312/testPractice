package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter the number = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int m = n;
		int sum = 0;
		while (n != 0) {
			int d = n % 10;
			sum = sum * 10 + d;
			n = n / 10;
		}

		if (sum == m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
