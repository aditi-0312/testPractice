package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HCF {

	public static void main(String[] args) {

		List<Integer> fx = new ArrayList<>();
		List<Integer> fy = new ArrayList<>();

		int x = 4;
		int y = 12;

		int factorNumx = 1;
		while (factorNumx <= x) {
			if (x % factorNumx == 0) {
				fx.add(factorNumx);
			}
			factorNumx++;
		}
		System.out.println(fx);

		int factorNumy = 1;
		while (factorNumy <= y) {
			if (y % factorNumy == 0) {
				fy.add(factorNumy);
			}
			factorNumy++;
		}
		System.out.println(fy);

		fy.retainAll(fx);

		System.out.println("HCF = " + Collections.max(fy));
	}

}
