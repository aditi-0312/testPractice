package practice;

import java.util.Scanner;

public class DuplicateChars {

	public static void main(String[] args) {
		System.out.print("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char []dupe=new char[s.length()];
		
		int temp = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					dupe[temp]=s.charAt(i);
					temp++;
				}
			}
		}
		
		for(int i=0;i<dupe.length;i++) {
			System.out.println(dupe[i]);
		}

	}

}
