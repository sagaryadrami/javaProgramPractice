package notforgit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortTheMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> lhm =  new LinkedHashMap<>();
		lhm.put(1, 99);
		lhm.put(2, 89);
		lhm.put(9, 23);
		lhm.put(7, 18);
		lhm.put(33, 92);
		
		Map<Integer,Integer> map = new TreeMap<>(lhm);
		for(Integer s :map.keySet()) {
			System.out.println(s + "value are as follows : " +map.get(s));
		}
		
		

	}

}
