package StringsQuestions;

import java.util.HashMap;

public class Duplicate_of_character {

	public static void main(String[] args) {
		String str="sagar yadrami qa engineer";
		checkTheDuplicateOccuranceOfCharacter(str);

	}
	 public static void checkTheDuplicateOccuranceOfCharacter(String str) {
		 HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		 for(int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 
			 count.put(ch, count.getOrDefault(ch,0)+1);
			 
			 
		 }
		 System.out.println("duplicate character are : ");
		 
		 for(char ch:count.keySet()) {
			 if(count.get(ch)>1) {
				 System.out.println(ch +" : "+count.get(ch));
			 }
		 }
		
}
}