package practice;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		System.out.print("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count;

		s = s.toLowerCase();

		String words[] = s.split(" ");
		
		System.out.println("Duplicate words are : ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;

					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}

	}

}
