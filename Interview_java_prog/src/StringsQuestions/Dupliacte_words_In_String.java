package StringsQuestions;

import java.util.HashMap;

public class Dupliacte_words_In_String {

	public static void main(String[] args) {
		String sentense="sagar";
		duplicateWordInAString(sentense);
	}
	
	public static void duplicateWordInAString(String Inpstr) {
		
		HashMap<String ,Integer> count = new HashMap<>();
		for(String w :Inpstr.split(" ")) {
			if(count.containsKey(w)) {
				count.put(w, count.get(w)+1);
			}else {
				count.put(w, 1);
			}
		}
		System.out.println(count);
	}
}
