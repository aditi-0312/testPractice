package practice;

import java.util.Scanner;

public class Average1 {

	public static void main(String[] args) {

		float x, average, sum = 0;
		int n, count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n = ");
		n = sc.nextInt();

		while (count <= n) {
			System.out.println("Enter the " + count + " number?");
			x = sc.nextFloat();
			sum += x;
			++count;
		}

		average = sum / n;
		System.out.println("The average is = " + average);
	}

}
