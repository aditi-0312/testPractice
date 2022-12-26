package practice;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		System.out.print("enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int sum = 0;

		while (n != 0) {

			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		if (m % sum == 0) {
			System.out.println("yes");
		} else
			System.out.println("no");

	}

}
