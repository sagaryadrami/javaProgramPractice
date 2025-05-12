package notforgit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueElementUsingStrem {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); list.add(2); list.add(3); list.add(1); list.add(2);

		System.out.println("original list with duplicate : " + list);
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(" list after removing the duplicate : " +newList);
	}

}
