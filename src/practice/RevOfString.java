package practice;

import java.util.Scanner;

public class RevOfString {

	public static void revOfWord(String s) {

		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed word: " + rev);
	}

	public static void revSentence(String sen) {

		sen = sen + " ";
		String revSen = "";
		String word = "";
		for (int i = 0; i < sen.length(); i++) {
			if (sen.charAt(i) != ' ') {
				word = word + sen.charAt(i);
			} else {
				revSen = word + " " + revSen;
				word = "";
			}
		}
		System.out.println(revSen);

	}

	static String revWordByWord(String str) {
		String rw = "";

		for (int i = str.length(); i > 0; --i) {
			rw = rw + str.charAt(i - 1);
		}
		return rw;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.print("Enter the word: ");
		// String s = sc.next();

		// System.out.print("Enter the sentence: ");
		// String sen = sc.nextLine();

		System.out.print("Enter the sentence: ");
		String str = sc.nextLine();

		// revOfWord(s);
		// revSentence(sen);
		System.out.println(revWordByWord(str));

	}

}
