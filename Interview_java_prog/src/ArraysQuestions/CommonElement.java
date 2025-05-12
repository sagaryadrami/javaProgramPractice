package ArraysQuestions;

import java.util.HashSet;

import java.util.Set;

public class CommonElement {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4,2,5,6};
		int[] a2= {2,3,6,7,8,9};
		Set<Integer> comele = commonArrayElement(a1,a2);
		System.out.println(comele);
	}

	public static Set<Integer> commonArrayElement(int[] arr1,int[] arr2) {
		Set<Integer> alladd = new HashSet<>();
		Set<Integer> common = new HashSet<>();
		
		for(int num:arr1) {
			alladd.add(num);
		}
		for(int num:arr2) {
			if(alladd.contains(num)) {
				common.add(num);
			}
		}
		return common;
	}
}
