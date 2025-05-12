package ArraysQuestions;

import java.util.ArrayList;

public class RemoveDuplicateUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Character> l = new ArrayList<>();
		l.add('g');
		l.add('e');
		l.add('e');
		l.add('k');
		l.add('s');
		removeDuplicate(l);

	}
	
	public static void removeDuplicate(ArrayList<Character> list) {
		ArrayList<Character> uniqueList = new ArrayList<>();
		
		for(Character ch : list) {
			if(!uniqueList.contains(ch)) {
				uniqueList.add(ch);
			}
		}
		System.out.println(uniqueList);
	}

}
