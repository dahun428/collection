package etc;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		stack1.add("1");
		stack1.add("2");
		stack1.add("3");
		
//		for(String value : stack1) {
//			System.out.println(value);
//		}
//		
		Stack<String> stack2 = new Stack<String>();
		stack2.push("1");
		stack2.push("2");
		stack2.push("3");
		
		while(!stack2.isEmpty()) {
			String value = stack2.pop();
			System.out.println(value);
		}
		
		
		
	}
}
