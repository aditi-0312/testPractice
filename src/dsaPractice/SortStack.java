package dsaPractice;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> temp = new Stack<>();

		s.push(1);
		s.push(4);
		s.push(0);
		s.push(2);
		s.push(9);
		s.push(3);

		System.out.println(s);

		while (!s.isEmpty()) {
			int x = s.pop();

			while (!temp.isEmpty() && temp.peek() > x) {
				int y = temp.pop();
				s.push(y);
			}
			temp.push(x);
		}
		System.out.println(temp);
	}

}
