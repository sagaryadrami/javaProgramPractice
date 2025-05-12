package notforgit;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str ="sagar";
		System.out.println(rmDuplicateFromString(str));

	}

	public static String rmDuplicateFromString(String str) {
		Set<Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char c:str.toCharArray()) {
			if(set.add(c)) {
			sb.append(c);
		}
		}
		return sb.toString();
	}
	
	
}
