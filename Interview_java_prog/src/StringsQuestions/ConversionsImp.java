package StringsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ConversionsImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s = {"sagar","interview","preperation","e","e"};

String str = Arrays.toString(s).toUpperCase();
	System.out.println(str); 
	toListConversion(s);
	toConvertToSet(s);

	}

	
	public static void toListConversion(String[] str) {
		List<String> list = new ArrayList<>(Arrays.asList(str));
		System.out.println(list);
	}
	
	public static void toConvertLinkedList(String[] str) {
		List<String> list = new LinkedList<>(Arrays.asList(str));
	}
	
	public static void toConvertToSet(String[] str) {
		Set<String> set = new HashSet<String>(Arrays.asList(str)) ;
		System.out.println(set);
	}
}
