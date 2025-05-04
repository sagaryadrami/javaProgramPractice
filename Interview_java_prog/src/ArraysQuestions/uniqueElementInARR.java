package ArraysQuestions;

import java.util.HashMap;

public class uniqueElementInARR {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,4,5,5,6,6};
		HashMap<Integer,Integer> count = new HashMap<>();
		for(int num : arr) {
			if(count.containsKey(num)) {
			count.put(num, count.get(num)+1);
		}else {
			count.put(num, 1);
		}
			
		}
		for(int num : count.keySet()) {
			if(count.get(num)==1) {
				System.out.println(num);
			}
		}
	}
}
