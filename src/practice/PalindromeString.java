package practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		System.out.print("enter the string = ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("YES");
		}else
			System.out.println("NO");
		//System.out.println(rev);
	}
}
