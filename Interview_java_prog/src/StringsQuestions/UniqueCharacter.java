package StringsQuestions;

import java.util.HashMap;

public class UniqueCharacter {

	public static void main(String[] args) {
		String str ="sagar";
		uniqueCharInString(str);
	}

	public static void uniqueCharInString(String str) {
		
		HashMap<Character,Integer> Charcount= new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			Charcount.put(ch, Charcount.getOrDefault(ch,0)+1);
		}
		System.out.println("unique characyer in the string : ");
		for(char ch:str.toCharArray()) {
			if(Charcount.get(ch)==1) {
				System.out.println(ch);
			}
		}
			
	}
}
