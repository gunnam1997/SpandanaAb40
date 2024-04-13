package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//UpCast ArrayList to list and know the behavior of list interface
public class CollectionSecondProgram {

	public static void main(String[] args) {
		List l = new ArrayList();//ArrayList is childClass of List interface 
		l.add(123);//List is an index based data structure 
		l.add(123);//List can store duplicate values 
		l.add("spandana");
		l.add("andhra pradesh");//List follow insertion order
		l.add(null);//List can store any numberOf null values 
		l.add(null);
		System.out.println("By using remove method :"+l.remove(1));
		System.err.println("By using get method :"+l.get(2));
		System.out.println("By using set method :"+l.set(3, "female"));
		System.err.println("By using indexOf method :"+l.indexOf(123));
		System.out.println("By using size method :"+l.size());
		System.err.println("By using contains method :"+l.contains(432));
		Iterator list = l.iterator();//We can get the elements one by one using iterator but it can be worked in forward direction only 
		while (list.hasNext()) {
			System.out.println(list.next());
		}

		ListIterator listI = l.listIterator();//We can get the elements one by one using ListIterator too by using this we can move both forward and backward directions 
		while (listI.hasNext()) {
			System.err.println(listI.next());
		}
		l.clear();	
	}
}
