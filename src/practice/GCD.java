package practice;

import java.util.ArrayList;
import java.util.Collections;

public class GCD {

	public static void main(String[] args) {
		int x = 6;
		int y = 12;

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		for (int i = 2; i <= x; i++) {
			if (x % i == 0)
				a.add(i);
		}

		System.out.println(a);
		
		for (int i = 2; i <= 12; i++) {
			if (y % i == 0)
				b.add(i);
		}

		System.out.println(b);
		
		b.retainAll(a);
		System.out.println( + Collections.max(b));
	}

}
