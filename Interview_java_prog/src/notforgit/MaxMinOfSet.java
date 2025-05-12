package notforgit;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxMinOfSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);set.add(2);set.add(3);
		
		System.out.println("maximum val : " +Collections.max(set) );
		System.out.println("minimum val : " +Collections.min(set));

	}

}
