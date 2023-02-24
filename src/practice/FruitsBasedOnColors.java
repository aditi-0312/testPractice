package practice;

import java.util.Scanner;

public class FruitsBasedOnColors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the color : ");
		String color=sc.next();
		
		switch(color) {
		
		case "pink" :
			System.out.println("Strawberry");
			break;
			
		case "red" :
			System.out.println("Cherry");
			break;
			
		case "green" :
			System.out.println("Kiwi");
			break;
			
		case "yellow" :
			System.out.println("Mango");
			break;
			
			default:
				System.out.println("Not valid!");
		}

	}

}
