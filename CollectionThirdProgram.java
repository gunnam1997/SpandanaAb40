package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//UpCast treeSet to Set and know the behavior of Set interface
public class CollectionThirdProgram {

	public static void main(String[] args) {
		Set s = new TreeSet();//TreeSet is childClass of set interface 
		s.add("name");//Set is not an index based data structure
		s.add("Place");//Set does not allow to stores duplicate elements 
		s.add("pincode");//Set does not follow the insertion order
		s.add("12345");
		//s.add(null);
		s.add("12345");
		//s.add(null);
		s.add("name");
		System.err.println("By using contains method :"+s.contains("name"));
		System.out.println("By using size method :"+s.size());
		System.err.println("By using isEmpty method :"+s.isEmpty());
		Iterator itr = s.iterator();//We can get the elements one by one using iterator but it can be worked in forward direction only 
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
