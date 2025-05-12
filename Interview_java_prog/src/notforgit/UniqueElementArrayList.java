package notforgit;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElementArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		
		removeDuplicate(list);
		
		System.out.println("original with duplicate : " + list);
		
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		
		ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>(set);
		
		System.out.println("list without duplicate "+withoutDuplicate);
	}
}
