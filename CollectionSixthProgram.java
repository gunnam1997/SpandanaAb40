package collection;

import java.util.Iterator;
import java.util.TreeSet;

//Iterate TreeSet elements using iterator and check if its possible to do from list Iterator?
public class CollectionSixthProgram {

	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add("Manish");
		tSet.add("Eeshan");
		tSet.add("GroTechMinds");
		tSet.add("spandana");
		
		Iterator itr = tSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//By using Iterator possible in TreeSet 
		//By using ListIterator it is not possible in TreeSet
	}

}
