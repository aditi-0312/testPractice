package practice;

import java.util.Scanner;

public class RevOfString {

	public static void main(String[] args) {
		//System.out.print("enter string: ");
		Scanner sc = new Scanner(System.in);
		/*String str=sc.nextLine();
		
		char[]s=new char[str.length()];
		int temp = 0;
		
		for(int i=str.length()-1;i>=0;i--) {
			s[temp]=str.charAt(i);
			temp++;
		}
		System.out.println(  s);
		
		System.out.println("Reverse a Sentence");
		
		System.out.print("enter sentence: ");

		String sen=sc.nextLine();
		String revSen=" ";
		
		for(int i=sen.length()-1;i>=0;i--) {
			if(sen.charAt(i)!=' ') {
			revSen=revSen+sen.charAt(i);
			}
		}
		System.out.println(revSen);*/
		
		
		System.out.println("reverse word by word");
		System.out.print("enter a statement: ");

		String statement =sc.nextLine();
		String r="";
		for(int i=statement.length()-1;i>0;--i) {
			r=r+(statement.charAt(i-1));
			
		}
		System.out.println(r);
		

	}

}
