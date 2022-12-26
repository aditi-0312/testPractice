package practice;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		System.out.print("Enter the number = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int sq=n*n;
		
		int flag=0;
		
		while(n!=0) {
			int d=n%10; int d1=sq%10;
			if(d!=d1) {
				flag=1;
			}
			n=n/10;sq=sq/10;
		}
		if(flag==0) {
			System.out.println("YES");
		}else
			System.out.println("NO");
	}

}
