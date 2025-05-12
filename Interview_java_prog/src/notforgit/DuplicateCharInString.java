package notforgit;

import java.util.HashMap;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str ="sagar yadrami ";
		duplicateOccurenceChar(str);
	}

	public static void duplicateOccurenceChar(String input) {
		HashMap<Character , Integer> count = new HashMap<>();
		for(int i =0;i<input.length();i++) {
			char ch = input.charAt(i);
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		System.out.println("suplicate character are : ");
		
		for(char ch:count.keySet()) {
			System.out.println(ch+" : "+count.get(ch));
		}
	}
}
