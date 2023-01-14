package practice;

import java.util.Scanner;

public class LargestOf3usingTernaryOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,largest,temp;
		
		System.out.print("Enter the first no. = ");
		a=sc.nextInt();
		
		System.out.print("Enter the second no. = ");
		b=sc.nextInt();
		
		System.out.print("Enter the third no. = ");
		c=sc.nextInt();

		temp=a>b?a:b;
		
		largest=c>temp?c:temp;
		
		System.out.print(largest);
	}

}
