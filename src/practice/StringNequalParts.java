package practice;

import java.util.Scanner;

public class StringNequalParts {

	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		
		int len = s.length();
		
		System.out.print("No. of parts: ");
		int N = sc.nextInt();
		
		int temp = 0, chars = len / N;
		
		 String[] equalStr = new String [N];  

		if (len % N != 0) {
			System.out.println("Given String canot be divided into " + N + " equal parts");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = s.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(N + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}
