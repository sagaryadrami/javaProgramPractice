package ArraysQuestions;

import java.util.Stack;

public class CheckValidString {

	public static void main(String[] args) {
		String inp = "({[)}]";
		if(checkStrValidity(inp)) {
			System.out.println("valid string");
		}else {
			System.out.println("not valid string ");
		}
	}
	
	public static boolean checkStrValidity(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			}else if(ch==')' || ch=='}' || ch == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				
				Character top = stack.pop();
				if(ch == '(' && top!= ')' ||
				   ch == '{' && top!= '}' ||
				   ch == '[' && top!= ']'
						) {
					return false;
				}
				
			}
		}
		return stack.isEmpty();
			
		}
	}


