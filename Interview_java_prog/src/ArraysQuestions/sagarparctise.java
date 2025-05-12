package ArraysQuestions;

import java.util.Stack;

public class sagarparctise {

	
	public static void main(String[] args) {
		String str = "(){[]}";
		if(checkString(str)) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		
	}
	public static boolean checkString(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[' ) {
				stack.push(ch);
			}else if(ch==')' || ch=='}' || ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				Character top = stack.pop();
				if(ch=='(' && top!=')' ||
				   ch=='{' && top!='}' ||
				   ch=='[' && top!=']') {
					return false;
				}
			}
			
		}
		return stack.isEmpty();
	}
}
