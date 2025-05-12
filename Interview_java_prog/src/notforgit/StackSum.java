package notforgit;

import java.util.Stack;

public class StackSum {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("sagar");
		stack.push("interview");
		stack.push("preperation");
		
		
		String[] str = new String[stack.size()];
		int index = 0;
		
		for(int i = 0; i<stack.size();i++) {
			str[index ++]=stack.pop();
		}
		
		for(String s:str) {
			System.out.println(s);
		}
	}
}
