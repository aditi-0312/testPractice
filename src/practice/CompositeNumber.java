package practice;

import java.util.Scanner;

public class CompositeNumber {

		public static void main(String[] args) {
			System.out.print("Enter the number = ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}
	}

