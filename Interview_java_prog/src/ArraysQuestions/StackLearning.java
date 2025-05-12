package ArraysQuestions;

import java.util.Iterator;
import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("camel");
		s.push("lion");
		s.push("zebra");
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
