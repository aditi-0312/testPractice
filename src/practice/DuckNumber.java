package practice;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int count=0;
		
		while(n!=0) {
			int d=n%10;
			if(d==0) {
				count++;
			}
			n=n/10;
		}
		if(count>0) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
