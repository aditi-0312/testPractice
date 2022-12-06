package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	static void isAnagram(String s, String s1){
		s=s.toLowerCase();
		s1 = s1.toLowerCase();
		
		if(s.length()!=s1.length()) {
			System.out.println("Given Strings are not anagram");
		}else {
			
			char[]str=s.toCharArray();
			char[]str1=s1.toCharArray();
			
			Arrays.sort(str);
			Arrays.sort(str1);
			
			if(Arrays.equals(str, str1)==true) {
				System.out.println("Given Strings are Anagram");
			}else {
				System.out.println("Given Strings are not Anagram");

			}
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter word: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.print("Enter another word: ");
		String s1 = sc.next();
		
		isAnagram(s,s1);
	}

}
