package notforgit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sort {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);set.add(3);set.add(2);
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		System.out.println(list);
	
		
//		System.out.println(set);
//		Object[] array = set.toArray();
//		Arrays.sort(array);
		
//		Collections.sort(set);
//		System.out.println(Arrays.toString(array));
	}

}

