package notforgit;

import java.util.*;
public class AddIntegerValueWithStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(30);
		stack.push(736);
		
		int sum=0;
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}

}
