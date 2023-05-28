package dsaPractice;
import java.util.*;
public class StackPractice {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		int idx=3;
		int value=8;
		
		//System.out.println(moveStack(s,s1));
		//System.out.println(reverseStack(s,s1,s2));
		System.out.println(insertAtGivenIndex(s,s1,idx,value));
		
	}


	private static Stack<Integer> insertAtGivenIndex(Stack<Integer> s, Stack<Integer> s1, int idx, int value) {
		
		for(int i=1;i<=idx;i++) {
			s1.push(s.pop());
		}
		s.push(value);
		
		while(!s1.isEmpty()) {
			s.push(s1.pop());
		}
		
		return s;
	}



	private static Stack<Integer> reverseStack(Stack<Integer> s, Stack<Integer> temp1, Stack<Integer> temp2) {
		while(!s.empty()) {
		int item=s.peek();
		temp1.push(item);
		s.pop();
		}
		
		while(!temp1.empty()) {
			int item=temp1.peek();
			temp2.push(item);
			temp1.pop();
			}
		while(!temp2.empty()) {
			int item=temp2.peek();
			s.push(item);
			temp2.pop();
			}
		return s;
	}

	private static Stack<Integer> moveStack(Stack<Integer> source, Stack<Integer> dest) {
		while(!source.empty()) {
			int item = source.peek();
			dest.push(item);
			source.pop();
		}
		return dest;
		
	}

}
