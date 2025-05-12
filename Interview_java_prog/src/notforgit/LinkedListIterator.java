package notforgit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIterator {
	
	public static void main(String[] args) {
		
		List<String> l = new LinkedList<>();
		l.add("sagar");
		l.add("interview");
		l.add("preperation");
				Iterator<String> it = l.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next()); 
				}
	}
}
