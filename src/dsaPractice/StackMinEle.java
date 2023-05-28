package dsaPractice;

import java.util.Stack;

public class StackMinEle {
	
	static Stack<Integer> mainStack= new Stack<Integer>();
	static Stack<Integer> temp= new Stack<Integer>();

	public static void main(String[] args) {

		customPush(12);
		customPush(24);
		customPush(23);
		customPush(14);
		customPush(56);
		customPush(5);
		
		customPop();
		
		System.out.println(mainStack);
		System.out.println(temp.peek()+" is the minimum element on the stack");
	}

	private static void customPop() {
		int top=mainStack.peek();
		mainStack.pop();
		if(temp.peek()==top)
			temp.pop();
		
	}

	private static void customPush(int i) {
		mainStack.push(i);
		if(temp.isEmpty())
			temp.push(i);
		
		else if(temp.peek()>i)
			temp.push(i);
			
	}

}
