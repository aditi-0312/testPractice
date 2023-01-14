package practice;

import java.util.Scanner;

public class CheckPerfectSquare {
	
	static boolean checkPerfectSquare(double number) {
		double sqrt = Math.sqrt(number);
		
		return ((sqrt-Math.floor(sqrt))==0);
		//returns the closest integer value (represented as a double value) 
		//which is less than or equal to the given double value
	}   
	public static void main(String[] args) {
		System.out.print("Enter the number = ");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		if(checkPerfectSquare(number)) {
			System.out.println("Given number is perfect square");
		}else {
			System.out.println("Given number is perfect square");
		}
	}

}
