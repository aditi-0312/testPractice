package practice;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		System.out.print("Enter the character = ");
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		int ascii=c;
		System.out.println("Ascii value of "+ c + " is = " + ascii);

	}

}
