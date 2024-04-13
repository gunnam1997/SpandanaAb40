package collection;

import java.util.ArrayList;
import java.util.Collection;

//Just check if you can upCast from arrayList to collection and utilize its method
public class CollectionFourthProgram {

	public static void main(String[] args) {
		Collection collect1 = new ArrayList();
		collect1.add("name");
		collect1.add("spandana");
		collect1.add("place");
		collect1.add("palakollu");
		collect1.add("Number");
		collect1.add(987654321);
		System.out.println(collect1);
		Collection collect2 = new ArrayList();
		collect2.add("name");
		collect2.add("sai");
		collect2.add("place");
		collect2.add("hyderabad");
		collect2.add("Number");
		collect2.add(123456789);
		System.err.println(collect2);
		collect1.addAll(collect2);
		System.out.println(collect1);
		System.err.println("By using containsAll method :"+collect1.containsAll(collect2));
		System.out.println("By using contains method :"+collect1.contains("sai ram"));
		System.err.println("By using isEmpty method :"+collect1.isEmpty());
		System.out.println("By using size method :"+collect1.size());
		System.err.println("By using remove method :"+collect2.remove(123456789));
		System.out.println("By using removeAll method :"+collect1.removeAll(collect2));
		collect1.clear();
	}

}
