package ArraysQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
	int[] arr = {1,8,5,2,1,8,9};
	
	Set<Integer> set = new LinkedHashSet<>();
	for(int num:arr) {
		set.add(num);
		
	}
	System.out.println(set);
	


	}

}
