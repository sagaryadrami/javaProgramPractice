package notforgit;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
		lhm.put("one", "one element");
		lhm.put("two", "two element");
		lhm.put("three", "third element");
		
		iteratingByFirstWay(lhm);
		interatingBySecondWay(lhm);
	}
	
	public static void iteratingByFirstWay(LinkedHashMap<String,String> lhm) {
		
		Set<String> keySet = lhm.keySet();
		for(String s:keySet) {
			System.out.println("the first way : "+s);
		}
	}
	
	public static void interatingBySecondWay(LinkedHashMap<String, String> lhm ) {
		 Set<Entry<String, String>> entrySet = lhm.entrySet();
		 
		 Iterator<Entry<String, String>> it = entrySet.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println("second way : "+it.next());
		 }
	}

}
