package practice;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();

		double temp;
		double sr = num / 2;

		do {
			temp = sr;
			sr = (temp + (num / temp)) / 2;

		} while ((temp - sr) != 0);
		System.out.print("square root of the given number is = " + sr);

		/*
		 * int b=10; do { System.out.println(b); b++; }while(b<5);
		 */

	}

}
