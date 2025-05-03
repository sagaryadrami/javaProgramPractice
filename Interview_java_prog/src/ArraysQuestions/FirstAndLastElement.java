package ArraysQuestions;

import java.util.ArrayList;

public class FirstAndLastElement {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("apple");
		arrlist.add("orange");
		arrlist.add("mango");
		arrlist.add("watermelon");
		arrlist.add("coconut");
		
		if(!arrlist.isEmpty()) {
			String firstElement = arrlist.get(0);
			String lastelement = arrlist.get(arrlist.size()-1);
			System.out.println("the first element is : "+ firstElement);
			System.out.println("the first element is : "+ lastelement);
		}else {
			System.out.println("the list is empty");
		}
		
		

	}

}
