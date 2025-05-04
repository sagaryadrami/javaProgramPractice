package ArraysQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RmDuplicateEleFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(9);
		
		ArrayList<Integer> result = removeDuplicateEleFromArrayList(list);
		System.out.println(result);

	}
	
	public static ArrayList<Integer> removeDuplicateEleFromArrayList(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<>(list);
		return new ArrayList<>(set);
	}

}
